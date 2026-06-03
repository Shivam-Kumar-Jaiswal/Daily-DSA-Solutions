# Write your MySQL query statement below
SELECT DISTINCT MAX(salary)as SecondHighestSalary from Employee where salary < (select MAX(salary)from Employee )

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna