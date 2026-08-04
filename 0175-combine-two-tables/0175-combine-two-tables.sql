# Write your MySQL query statement below
SELECT
    p.firstName,
    p.lastName,
    a.city,
    a.state
FROM Person p
LEFT JOIN Address a
ON p.personId = a.personId;


-- SELECT
--     firstName,
--     lastName,
--     (SELECT city
--      FROM Address
--      WHERE Address.personId = Person.personId) AS city,
--     (SELECT state
--      FROM Address
--      WHERE Address.personId = Person.personId) AS state
-- FROM Person;