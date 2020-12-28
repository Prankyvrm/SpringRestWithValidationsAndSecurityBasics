DROP TABLE IF EXISTS billionaires;

CREATE TABLE billionaires (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  company VARCHAR(250) DEFAULT NULL
);

INSERT INTO billionaires (name, company) VALUES
  ('Jeff Besoz', 'Amazon'),
  ('Tim Cook', 'Apple'),
  ('Mukesh Ambani', 'Reliance'),
  ('Bill Gates', 'Microsoft');