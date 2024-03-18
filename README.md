Token

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


||Java coding interview questions for QA ||

1. String reverse. Write a method that will take one string as an argument and will return the reverse version of this string.

2. Array reverse. Write a method that will take an array as an argument and reverse it.

3. Reverse words. Write a method that will take a string as an argument. The method will reverse the position of words and return it.

4. String palindrome. A palindrome is a word, phrase, number, or sequence of words that reads the same backward as forward.

5. Number palindrome. A palindrome is a word, phrase, number, or sequence of words that reads the same backward as forward.

6. Max/min number from an array. Write a method that will accept an array of int as an argument and it returns the max/min number from a given array.

7. Find the second min/max number from an array. Write a method that accepts int array as an argument and returns second or n min/max number from the given array.

8. Static keyword in Java. The static keyword is a very popular question in the interviews.

9. String Pool and == operator to compare references in Java. Let’s see an example, what’s output from this program? Why this output?

10. Swap values of two variables without direct reassignment and without creating any extra variables.

11. Two string anagram. An anagram is when all the letters in one string exist in another but the order of letters does not matter. Write a method that accepts two string arguments and returns true if they are anagram and false if they are not.

12. Remove duplicates from a string. Write a method that accepts one string argument and returns it without duplicates.


As a Software Development Engineer in Test (SDET), SQL is essential to ace technical interviews!

1. Basic SQL Queries:
  - Fetch all columns from a table:
   - SELECT * FROM table_name;
  - Get distinct values from a column:
   - SELECT DISTINCT column_name FROM table_name;
  - Retrieve top N records from a table:
   - SELECT * FROM table_name LIMIT N;

2. Filtering and Sorting:
  - Filter rows where a column equals a value:
   - SELECT * FROM table_name WHERE column_name = value;
  - Filter rows within a range:
   - SELECT * FROM table_name WHERE column_name BETWEEN value1 AND value2;
  - Retrieve rows with NULL values in a column:
   - SELECT * FROM table_name WHERE column_name IS NULL;
  - Sort result set in ascending/descending order:
   - SELECT * FROM table_name ORDER BY column_name ASC/DESC;

3. Aggregate Functions:
  - Count total rows:
   - SELECT COUNT(*) FROM table_name;
  - Calculate average, sum, min, max:
   - SELECT AVG(column_name), SUM(column_name), MIN(column_name), MAX(column_name) FROM table_name;
  - Group and calculate aggregates:
   - SELECT column_name, AVG(salary) FROM table_name GROUP BY column_name;

4. Joins:
  - INNER, LEFT, RIGHT, FULL joins explained:
   - INNER: Retrieve common rows from both tables.
   - LEFT: All rows from the left table and matching rows from the right.
   - RIGHT: All rows from the right table and matching from the left.
   - FULL: All rows from both tables.
  - Retrieve data from multiple tables:
   - SELECT * FROM table1 JOIN table2 ON table1.column_name = table2.column_name;

5. Subqueries:
  - Using a subquery to retrieve data:
   - SELECT * FROM table_name WHERE column_name IN (SELECT column_name FROM another_table);
  - Comparing values between tables:
   - SELECT * FROM table1 WHERE column_name = (SELECT column_name FROM table2 WHERE condition);

6. Data Modification:
  - Insert new record:
   - INSERT INTO table_name (column1, column2, ...) VALUES (value1, value2, ...);
  - Update records:
   - UPDATE table_name SET column_name = new_value WHERE condition;
  - Delete records:
   - DELETE FROM table_name WHERE condition;

7. Table Design and Constraints:
  - Primary key vs. Foreign key differences:
   - Primary key uniquely identifies a record, while a foreign key links to another table's primary key.
  - Design a table schema:
   - Create table with appropriate columns, primary keys, and foreign keys.

8. Advanced Queries:
  - Retrieve the nth highest (or lowest) value:
   - SELECT column_name FROM table_name ORDER BY column_name DESC LIMIT n-1, 1;
   
   
API Automation Interview Questions for SDET Role!

Are you preparing for an interview as a Software Development Engineer in Test (SDET) with a focus on API automation?

1️⃣ What is API automation testing? How does it differ from UI automation testing?

2️⃣ What are the advantages of API automation testing?

3️⃣ How do you select the appropriate tools and frameworks for API automation testing?

4️⃣ Explain the steps involved in testing an API.

5️⃣ What are the commonly used HTTP methods in API testing?

6️⃣ What is the difference between GET and POST methods in API testing?

7️⃣ How do you handle authentication and authorization in API automation testing?

8️⃣ What is JSON? How do you parse and validate JSON responses in API automation testing?

9️⃣ What is the role of assertions in API automation testing?

🔟 How do you handle dynamic data in API responses during automation?

1️⃣1️⃣ What is endpoint testing, and how do you perform it?

1️⃣2️⃣ How do you handle error responses and status codes in API automation testing?

1️⃣3️⃣ What are some common challenges faced in API automation testing, and how do you overcome them?
