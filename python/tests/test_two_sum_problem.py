# tests/test_two_sum_problem.py

'''
Alright — here’s a clean interview-style version of the Two Sum problem exactly how it might be presented in a live coding interview.

⸻

Problem: Two Sum

You are given a list of integers nums and an integer target.

Your task is to return the indices of two numbers in the list that add up to the target.

Rules
	•	Each input will have exactly one valid solution.
	•	You cannot use the same element twice.
	•	The order of the returned indices does not matter.

⸻

Function Signature

Implement the following function in Python:

def two_sum(nums: list[int], target: int) -> list[int]:
    pass


⸻

Example 1

Input:

nums = [2, 7, 11, 15]
target = 9

Output:

[0, 1]

Explanation:

nums[0] + nums[1] = 2 + 7 = 9


⸻

Example 2

Input:

nums = [3, 2, 4]
target = 6

Output:

[1, 2]


⸻

Example 3

Input:

nums = [3, 3]
target = 6

Output:

[0, 1]


⸻

Constraints
	•	2 <= len(nums) <= 10,000
	•	-10^9 <= nums[i] <= 10^9
	•	-10^9 <= target <= 10^9

⸻

Follow-up (often asked in interviews)

Can you solve this in better than O(n²) time complexity?

⸻

Optional Test Harness (you can use if you want)

def test_two_sum():
    assert sorted(two_sum([2,7,11,15], 9)) == [0,1]
    assert sorted(two_sum([3,2,4], 6)) == [1,2]
    assert sorted(two_sum([3,3], 6)) == [0,1]


⸻

When you’re ready, send me your solution, and I’ll review it the same way an interviewer would:
	•	correctness
	•	clarity
	•	time complexity
	•	interview feedback.

'''

def two_sum(nums: list[int], target: int) -> list[int]:
    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            if nums[i] + nums[j] == target:
                return [i, j]
    return []

def test_two_sum_problem():
    assert two_sum([2, 7, 11, 15], 9) == [0, 1]
    assert two_sum([3, 2, 4], 6) == [1, 2]
    assert two_sum([3, 3], 6) == [0, 1]
    
