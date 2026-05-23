# Write your MySQL query statement below
select p.firstName,p.lastName,a.city,a.state from Person p left join Address a on p.personId=a.personId

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna