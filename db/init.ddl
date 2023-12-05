-- BudgetApp Schema.
-- To only be run to reset the database back to factory settings (empty tables)

DROP SCHEMA IF EXISTS BudgetApp CASCADE;
CREATE SCHEMA BudgetApp;
SET SEARCH_PATH to BudgetApp, public;

SET TIME ZONE 'EST';

-- ENTITY: An account
CREATE TABLE Account (
  id SERIAL PRIMARY KEY,
  username TEXT NOT NULL,
  password TEXT NOT NULL,
  -- login must be unique
  UNIQUE (username)
);

-- ENTITY: A Transaction Type.
CREATE TABLE TransactionType (
  id TEXT PRIMARY KEY
);

INSERT INTO TransactionType (id)
VALUES ('FIXED'), ('RECUR'), ('VARIABLE');

-- ENTITY: A Transaction Frequency Type.
CREATE TABLE TransactionFrequencyType (
  id TEXT PRIMARY KEY
);

INSERT INTO TransactionFrequencyType (id)
VALUES ('EVERY_X_DAYS'), ('EVERY_X_WEEKS'), ('EVERY_X_MONTHS');

-- ENTITY: A Transaction Frequency Type.
CREATE TABLE TransactionTemplate (
  id SERIAL PRIMARY KEY,
  accountId INT NOT NULL,
  transactionType TEXT NOT NULL,
  startDate DATE,
  endDate DATE,
  nextDate DATE NOT NULL DEFAULT NOW(),
  value REAL NOT NULL DEFAULT 0,
  name TEXT NOT NULL,
  description TEXT,
  frequencyType TEXT NOT NULL,
  frequencyVar INT NOT NULL,

  FOREIGN KEY (accountId) REFERENCES Account(id),
  FOREIGN KEY (transactionType) REFERENCES TransactionType(id),
  FOREIGN KEY (frequencyType) REFERENCES TransactionFrequencyType(id)
);

CREATE TABLE Transaction (
  id SERIAL PRIMARY KEY,
  accountId INT NOT NULL,
  transactionTemplate INT NOT NULL,
  value REAL NOT NULL DEFAULT 0,
  date DATE NOT NULL DEFAULT NOW(),
  comment TEXT,

  FOREIGN KEY (accountId) REFERENCES Account(id),
  FOREIGN KEY (transactionTemplate) REFERENCES TransactionTemplate(id)
);



