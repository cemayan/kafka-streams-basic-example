DROP TABLE IF EXISTS RULES;
CREATE TABLE RULES (
                                 id SERIAL PRIMARY KEY,
                                 RULE_NAME VARCHAR(16) NOT NULL,
                                 EVENT_NAME VARCHAR(20) NOT NULL,
                                 CONFIG VARCHAR(2013123) NOT NULL
);


DROP TABLE IF EXISTS RULES_MANAGEMENT;
CREATE TABLE RULES_MANAGEMENT (
                       id SERIAL PRIMARY KEY,
                       RULE1 INT NOT NULL,
                       RULE2 INT NOT NULL,
                       LOGIC_OPERATOR VARCHAR(20) NOT NULL,
                       TIME_SELECTOR VARCHAR(20) NOT NULL,
                       TIME_VALUE INT NOT NULL,
                       STATUS BOOLEAN NOT NULL
);