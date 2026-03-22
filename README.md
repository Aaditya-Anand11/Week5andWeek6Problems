# Week 5 & Week 6 Problems — Java Arrays

Java array practice problems organized by difficulty level. All programs follow Java best practices.

## Best Practices Applied

1. All values stored as variables (no hardcoding)
2. Proper naming conventions for all variables and classes
3. Comments for every logical block
4. Input validation with `System.err` and `System.exit()`
5. Array `.length` property used in all for loops
6. Scanner objects closed after use

## Project Structure

```
src/
├── Level1/
│   ├── StudentVotingAge.java       — Voting eligibility for 10 students
│   ├── NumberAnalysis.java         — Positive/negative/zero, even/odd analysis
│   ├── MultiplicationTable.java    — Multiplication table stored in array
│   └── NumberSumAccumulator.java   — Accumulate up to 10 numbers, show sum
├── Level2/
│   ├── EmployeeBonus.java          — Zara bonus calculation for 10 employees
│   ├── YoungestTallestFriends.java — Find youngest/tallest among 3 friends
│   └── LargestSecondLargestDigit.java — Largest and 2nd largest digit finder
└── Level3/
    └── DigitFrequency.java         — Frequency of each digit in a number
```

## How to Compile and Run

Navigate to the directory of the program and compile with `javac`:

```bash
# Example: Level 1 - Student Voting Age
cd src/Level1
javac StudentVotingAge.java
java StudentVotingAge

# Example: Level 2 - Employee Bonus
cd src/Level2
javac EmployeeBonus.java
java EmployeeBonus

# Example: Level 3 - Digit Frequency
cd src/Level3
javac DigitFrequency.java
java DigitFrequency
```

## Problem Descriptions

### Level 1

| # | Program | Description |
|---|---------|-------------|
| 1 | `StudentVotingAge` | Takes age of 10 students, checks if each can vote (age ≥ 18). Invalid (negative) ages are flagged. |
| 2 | `NumberAnalysis` | Takes 5 integers, classifies each as positive/negative/zero. For positives, checks even/odd. Compares first and last elements. |
| 3 | `MultiplicationTable` | Generates multiplication table (1–10) for a user-supplied number, stores results in array, displays table. |
| 4 | `NumberSumAccumulator` | Collects numbers into array (max 10, stops at 0 or negative). Displays all numbers and their sum. |

### Level 2

| # | Program | Description |
|---|---------|-------------|
| 1 | `EmployeeBonus` | Calculates bonus (5% for >5 years service, 2% otherwise) for 10 Zara employees. Shows old/new salary and total payout. |
| 2 | `YoungestTallestFriends` | Takes age and height for Amar, Akbar, and Anthony. Finds and displays the youngest and tallest. |
| 3 | `LargestSecondLargestDigit` | Extracts digits of a number into a dynamically resized array and finds the largest and second largest digit. |

### Level 3

| # | Program | Description |
|---|---------|-------------|
| 1 | `DigitFrequency` | Takes a number, extracts its digits, uses a frequency array of size 10 to count how many times each digit (0–9) appears. |

## Author

**Aaditya Anand**
