[![CircleCI](https://img.shields.io/circleci/build/gh/hanggrian/grind-leetcode)](https://app.circleci.com/pipelines/github/hanggrian/grind-leetcode/)
[![Codecov](https://img.shields.io/codecov/c/gh/hanggrian/grind-leetcode)](https://app.codecov.io/gh/hanggrian/grind-leetcode/)
[![OpenJDK](https://img.shields.io/badge/java-8+-f80000)](https://docs.oracle.com/javase/8/)
[![Python](https://img.shields.io/badge/python-3+-3776ab)](https://docs.python.org/3/whatsnew/3.13.html)
[![Node](https://img.shields.io/badge/node-23+-5Fa04e)](https://nodejs.org/en/blog/release/v23.9.0/)

# Let's grind LeetCode!

![The project logo.](https://github.com/hanggrian/grind-leetcode/raw/assets/logo.png)

Solutions and visual explanations to LeetCode problems.

## Concepts

- [List node](https://hanggrian.github.io/grind-leetcode/concept-list-node.html)
- [Tree node](https://hanggrian.github.io/grind-leetcode/concept-tree-node.html)

## Problems

<style>
  /* hotfix to show arrow toggle on 'block' layout */
  details summary {
    display: list-item;
  }

  sup[for="easy"]::after {
    color: rgb(0, 184, 163);
    content: "Easy";
  }

  sup[for="medium"]::after {
    color: rgb(255, 192, 30);
    content: "Medium";
  }

  sup[for="hard"]::after {
    color: rgb(255, 55, 95);
    content: "Hard";
  }
</style>

> #### Legend
>
> - <s>Strikethrough:</s> Problems locked behind a paywall.
> - Normal: Unsolved problems.
> - [Link](#): Solution available.
> - <b>[Bold Link](#):</b> Solution with graphics.
> - <sup for="easy"></sup>, <sup for="medium"></sup>, <sup for="hard"></sup>:
    Problem difficulty level.

### Unofficial listing

<blockquote>
  <details>
  <summary><b>Grind 75</b></summary>

  [Visit problem set](https://www.techinterviewhandbook.org/grind75/)

  - Week 1
    1.  [**Two Sum<sup for="easy"></sup>**](https://hanggrian.github.io/grind-leetcode/two-sum)
    1.  [**Valid Parentheses<sup for="easy"></sup>**](https://hanggrian.github.io/grind-leetcode/valid-parentheses)
    1.  [**Merge Two Sorted Lists<sup for="easy"></sup>**](https://hanggrian.github.io/grind-leetcode/merge-two-sorted-lists)
    1.  [Best Time to Buy and Sell Stock<sup for="easy"></sup>](https://hanggrian.github.io/grind-leetcode/best-time-to-buy-and-sell-stock)
    1.  [**Valid Palindrome<sup for="easy"></sup>**](https://hanggrian.github.io/grind-leetcode/valid-palindrome)
    1.  [**Invert Binary Tree<sup for="easy"></sup>**](https://hanggrian.github.io/grind-leetcode/invert-binary-tree)
    1.  Valid Anagram<sup for="easy"></sup>
    1.  Binary Search<sup for="easy"></sup>
    1.  Flood Fill<sup for="easy"></sup>
    1.  Lowest Common Ancestor of a Binary Search Tree<sup for="easy"></sup>
    1.  [Balanced Binary Tree<sup for="easy"></sup>](https://hanggrian.github.io/grind-leetcode/balanced-binary-tree)
    1.  [**Linked List Cycle<sup for="easy"></sup>**](https://hanggrian.github.io/grind-leetcode/linked-list-cycle)
    1.  Implement Queue using Stacks<sup for="easy"></sup>
  - Week 2
    1.  First Bad Version<sup for="easy"></sup>
    1.  Ransom Note<sup for="easy"></sup>
    1.  [Climbing Stairs<sup for="easy"></sup>](https://hanggrian.github.io/grind-leetcode/climbing-stairs)
    1.  Longest Palindrome<sup for="easy"></sup>
    1.  Reverse Linked List<sup for="easy"></sup>
    1.  Majority Element<sup for="easy"></sup>
    1.  Add Binary<sup for="easy"></sup>
    1.  Diameter of Binary Tree<sup for="easy"></sup>
    1.  Middle of the Linked List<sup for="easy"></sup>
    1.  [Maximum Depth of Binary Tree<sup for="easy"></sup>](https://hanggrian.github.io/grind-leetcode/maximum-depth-of-binary-tree)
    1.  Contains Duplicate<sup for="easy"></sup>
    1.  [Maximum Subarray<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/maximum-subarray)
  - Week 3
    1.  Insert Interval<sup for="medium"></sup>
    1.  01 Matrix<sup for="medium"></sup>
    1.  K Closest Points to Origin<sup for="medium"></sup>
    1.  [**Longest Substring Without Repeating Characters<sup for="medium"></sup>**](https://hanggrian.github.io/grind-leetcode/longest-substring-without-repeating-characters)
    1.  [**Three Sum<sup for="medium"></sup>**](https://hanggrian.github.io/grind-leetcode/three-sum)
    1.  [Binary Tree Level Order Traversal<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/binary-tree-level-order-traversal)
    1.  Clone Graph<sup for="medium"></sup>
    1.  Evaluate Reverse Polish Notation<sup for="medium"></sup>
  - Week 4
    1.  Course Schedule<sup for="medium"></sup>
    1.  Implement Trie (Prefix Tree)<sup for="medium"></sup>
    1.  Coin Change<sup for="medium"></sup>
    1.  Product of Array Except Self<sup for="medium"></sup>
    1.  [Min Stack<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/min-stack)
    1.  [Validate Binary Search Tree<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/validate-binary-search-tree)
    1.  Number of Islands<sup for="medium"></sup>
    1.  Rotting Oranges<sup for="medium"></sup>
  - Week 5
    1.  Search in Rotated Sorted Array<sup for="medium"></sup>
    1.  Combination Sum<sup for="medium"></sup>
    1.  [Permutations<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/permutations)
    1.  [Merge Intervals<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/merge-intervals)
    1.  Lowest Common Ancestor of a Binary Tree<sup for="medium"></sup>
    1.  Time Based Key-Value Store<sup for="medium"></sup>
    1.  Accounts Merge<sup for="medium"></sup>
    1.  [Sort Colors<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/sort-colors)
  - Week 6
    1.  [Word Break<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/word-break)
    1.  Partition Equal Subset Sum<sup for="medium"></sup>
    1.  [**String to Integer (atoi)<sup for="medium"></sup>**](https://hanggrian.github.io/grind-leetcode/string-to-integer-atoi)
    1.  Spiral Matrix<sup for="medium"></sup>
    1.  Subsets<sup for="medium"></sup>
    1.  Binary Tree Right Side View<sup for="medium"></sup>
    1.  [Longest Palindromic Substring<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/longest-palindromic-substring)
    1.  Unique Paths<sup for="medium"></sup>
    1.  [Construct Binary Tree from Preorder and Inorder Traversal<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/construct-binary-tree-from-preorder-and-inorder-traversal)
  - Week 7
    1.  [**Container With Most Water<sup for="medium"></sup>**](https://hanggrian.github.io/grind-leetcode/container-with-most-water)
    1.  Letter Combinations of a Phone Number<sup for="medium"></sup>
    1.  [Word Search<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/word-search)
    1.  Find All Anagrams in a String<sup for="medium"></sup>
    1.  Minimum Height Trees<sup for="medium"></sup>
    1.  Task Scheduler<sup for="medium"></sup>
    1.  [LRU Cache<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/lru-cache)
  - Week 8
    1.  Kth Smallest Element in a BST<sup for="medium"></sup>
    1.  [Minimum Window Substring<sup for="hard"></sup>](https://hanggrian.github.io/grind-leetcode/minimum-window-substring)
    1.  Serialize and Deserialize Binary Tree<sup for="hard"></sup>
    1.  [Trapping Rain Water<sup for="hard"></sup>](https://hanggrian.github.io/grind-leetcode/trapping-rain-water)
    1.  Find Median from Data Stream<sup for="hard"></sup>
    1.  [Word Ladder<sup for="hard"></sup>](https://hanggrian.github.io/grind-leetcode/word-ladder)
    1.  Basic Calculator<sup for="hard"></sup>
    1.  Maximum Profit in Job Scheduling<sup for="hard"></sup>
    1.  [**Merge k Sorted Lists<sup for="hard"></sup>**](https://hanggrian.github.io/grind-leetcode/merge-k-sorted-lists)
    1.  Largest Rectangle in Histogram<sup for="hard"></sup>
  </details>
</blockquote>

<blockquote>
  <details>
  <summary><b>Neetcode 150</b></summary>

  [Visit problem set](https://neetcode.io/practice?tab=neetcode150)

  - Arrays & Hashing
    1.  Contains Duplicate<sup for="easy"></sup>
    1.  Valid Anagram<sup for="easy"></sup>
    1.  [**Two Sum<sup for="easy"></sup>**](https://hanggrian.github.io/grind-leetcode/two-sum)
    1.  Group Anagrams<sup for="medium"></sup>
    1.  Top K Frequent Elements<sup for="medium"></sup>
    1.  Encode and Decode Strings<sup for="medium"></sup>
    1.  Product of Array Except Self<sup for="medium"></sup>
    1.  [**Valid Sudoku<sup for="medium"></sup>**](https://hanggrian.github.io/grind-leetcode/valid-sudoku)
    1.  Longest Consecutive Sequence<sup for="medium"></sup>
  - Two Pointers
    1.  [**Valid Palindrome<sup for="easy"></sup>**](https://hanggrian.github.io/grind-leetcode/valid-palindrome)
    1.  Two Sum II - Input Array Is Sorted<sup for="medium"></sup>
    1.  [**Three Sum<sup for="medium"></sup>**](https://hanggrian.github.io/grind-leetcode/three-sum)
    1.  [**Container With Most Water<sup for="medium"></sup>**](https://hanggrian.github.io/grind-leetcode/container-with-most-water)
    1.  [Trapping Rain Water<sup for="hard"></sup>](https://hanggrian.github.io/grind-leetcode/trapping-rain-water)
  - Sliding Window
    1.  [Best Time to Buy and Sell Stock<sup for="easy"></sup>](https://hanggrian.github.io/grind-leetcode/best-time-to-buy-and-sell-stock)
    1.  [**Longest Substring Without Repeating Characters<sup for="medium"></sup>**](https://hanggrian.github.io/grind-leetcode/longest-substring-without-repeating-characters)
    1.  Longest Repeating Character Replacement<sup for="medium"></sup>
    1.  Permutation In String<sup for="medium"></sup>
    1.  [Minimum Window Substring<sup for="hard"></sup>](https://hanggrian.github.io/grind-leetcode/minimum-window-substring)
    1.  Sliding Window Maximum<sup for="hard"></sup>
  - Stack
    1.  [**Valid Parentheses<sup for="easy"></sup>**](https://hanggrian.github.io/grind-leetcode/valid-parentheses)
    1.  [Min Stack<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/min-stack)
    1.  Evaluate Reverse Polish Notation<sup for="medium"></sup>
    1.  Generate Parentheses<sup for="medium"></sup>
    1.  Daily Temperatures<sup for="medium"></sup>
    1.  Car Fleet<sup for="medium"></sup>
    1.  Largest Rectangle in Histogram<sup for="hard"></sup>
  - Binary Search
    1.  Binary Search<sup for="easy"></sup>
    1.  Search in Rotated Sorted Array<sup for="medium"></sup>
    1.  Find Minimum in Rotated Sorted Array<sup for="medium"></sup>
    1.  [Search a 2D Matrix<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/search-a-2d-matrix)
    1.  Search a 2D Matrix II<sup for="medium"></sup>
    1.  Kth Smallest Element in a Sorted Matrix<sup for="medium"></sup>
    1.  [Find Peak Element<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/find-peak-element)
    1.  Peak Index in a Mountain Array<sup for="hard"></sup>
  - Linked List
    1.  Reverse Linked List<sup for="easy"></sup>
    1.  [**Merge Two Sorted Lists<sup for="easy"></sup>**](https://hanggrian.github.io/grind-leetcode/merge-two-sorted-lists)
    1.  [**Linked List Cycle<sup for="easy"></sup>**](https://hanggrian.github.io/grind-leetcode/linked-list-cycle)
    1.  [Reorder List<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/reorder-list)
    1.  [**Remove Nth Node From End of List<sup for="medium"></sup>**](https://hanggrian.github.io/grind-leetcode/remove-nth-node-from-end-of-list)
    1.  Copy List With Random Pointer<sup for="medium"></sup>
    1.  [**Add Two Numbers<sup for="medium"></sup>**](https://hanggrian.github.io/grind-leetcode/add-two-numbers)
    1.  Find The Duplicate Number<sup for="medium"></sup>
    1.  [LRU Cache<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/lru-cache)
    1.  [**Merge k Sorted Lists<sup for="hard"></sup>**](https://hanggrian.github.io/grind-leetcode/merge-k-sorted-lists)
    1.  Reverse Nodes In K Group<sup for="hard"></sup>
  - Trees
    1.  [**Invert Binary Tree<sup for="easy"></sup>**](https://hanggrian.github.io/grind-leetcode/invert-binary-tree)
    1.  [Maximum Depth of Binary Tree<sup for="easy"></sup>](https://hanggrian.github.io/grind-leetcode/maximum-depth-of-binary-tree)
    1.  Diameter of Binary Tree<sup for="easy"></sup>
    1.  [Balanced Binary Tree<sup for="easy"></sup>](https://hanggrian.github.io/grind-leetcode/balanced-binary-tree)
    1.  [Same Tree<sup for="easy"></sup>](https://hanggrian.github.io/grind-leetcode/same-tree)
    1.  Subtree of Another Tree<sup for="easy"></sup>
    1.  Lowest Common Ancestor of a Binary Search Tree<sup for="medium"></sup>
    1.  [Binary Tree Level Order Traversal<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/binary-tree-level-order-traversal)
    1.  Binary Tree Right Side View<sup for="medium"></sup>
    1.  Count Good Nodes In Binary Tree<sup for="medium"></sup>
    1.  [Validate Binary Search Tree<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/validate-binary-search-tree)
    1.  Kth Smallest Element In a Bst<sup for="medium"></sup>
    1.  [Construct Binary Tree from Preorder and Inorder Traversal<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/construct-binary-tree-from-preorder-and-inorder-traversal)
    1.  Binary Tree Maximum Path Sum<sup for="hard"></sup>
    1.  Serialize And Deserialize Binary Tree<sup for="hard"></sup>
  - Heap / Priority Queue
    1.  Kth Largest Element In a Stream<sup for="easy"></sup>
    1.  Last Stone Weight<sup for="easy"></sup>
    1.  K Closest Points to Origin<sup for="medium"></sup>
    1.  Kth Largest Element In An Array<sup for="medium"></sup>
    1.  Task Scheduler<sup for="medium"></sup>
    1.  Design Twitter<sup for="medium"></sup>
    1.  Find Median From Data Stream<sup for="hard"></sup>
  - Backtracking
    1.  Subsets<sup for="medium"></sup>
    1.  Combination Sum<sup for="medium"></sup>
    1.  Combination Sum II<sup for="medium"></sup>
    1.  [Permutations<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/permutations)
    1.  Subsets II<sup for="medium"></sup>
    1.  [Word Search<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/word-search)
    1.  Palindrome Partitioning<sup for="medium"></sup>
    1.  Letter Combinations of a Phone Number<sup for="medium"></sup>
    1.  N Queens<sup for="hard"></sup>
  - Tries
    1.  Implement Trie Prefix Tree<sup for="medium"></sup>
    1.  Design Add And Search Words Data Structure<sup for="medium"></sup>
    1.  Word Search II<sup for="hard"></sup>
  - Graphs
    1.  Number of Islands<sup for="medium"></sup>
    1.  Max Area of Island<sup for="medium"></sup>
    1.  Clone Graph<sup for="medium"></sup>
    1.  Walls And Gates<sup for="medium"></sup>
    1.  Rotting Oranges<sup for="medium"></sup>
    1.  Pacific Atlantic Water Flow<sup for="medium"></sup>
    1.  Surrounded Regions<sup for="medium"></sup>
    1.  Course Schedule<sup for="medium"></sup>
    1.  Course Schedule II<sup for="medium"></sup>
    1.  Graph Valid Tree<sup for="medium"></sup>
    1.  Number of Connected Components In An Undirected Graph<sup for="medium"></sup>
    1.  Redundant Connection<sup for="medium"></sup>
    1.  [Word Ladder<sup for="hard"></sup>](https://hanggrian.github.io/grind-leetcode/word-ladder)
  - Advanced Graphs
    1.  Network Delay Time<sup for="medium"></sup>
    1.  Reconstruct Itinerary<sup for="hard"></sup>
    1.  Min Cost to Connect All Points<sup for="medium"></sup>
    1.  Swim In Rising Water<sup for="hard"></sup>
    1.  Alien Dictionary<sup for="hard"></sup>
    1.  Cheapest Flights Within K Stops<sup for="medium"></sup>
  - 1-D Dynamic Programming
    1.  [Climbing Stairs<sup for="easy"></sup>](https://hanggrian.github.io/grind-leetcode/climbing-stairs)
    1.  Min Cost Climbing Stairs<sup for="easy"></sup>
    1.  House Robber<sup for="medium"></sup>
    1.  House Robber II<sup for="medium"></sup>
    1.  [Longest Palindromic Substring<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/longest-palindromic-substring)
    1.  Palindromic Substrings<sup for="medium"></sup>
    1.  Decode Ways<sup for="medium"></sup>
    1.  Coin Change<sup for="medium"></sup>
    1.  [Maximum Product Subarray<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/maximum-product-subarray)
    1.  [Word Break<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/word-break)
    1.  Longest Increasing Subsequence<sup for="medium"></sup>
    1.  Partition Equal Subset Sum<sup for="medium"></sup>
  - 2-D Dynamic Programming
    1.  Unique Paths<sup for="medium"></sup>
    1.  Longest Common Subsequence<sup for="medium"></sup>
    1.  Best Time to Buy And Sell Stock With Cooldown<sup for="medium"></sup>
    1.  Coin Change II<sup for="medium"></sup>
    1.  Target Sum<sup for="medium"></sup>
    1.  Interleaving String<sup for="medium"></sup>
    1.  Longest Increasing Path In a Matrix<sup for="hard"></sup>
    1.  Distinct Subsequences<sup for="hard"></sup>
    1.  Edit Distance<sup for="medium"></sup>
    1.  Burst Balloons<sup for="hard"></sup>
    1.  Regular Expression Matching<sup for="hard"></sup>
  - Greedy
    1.  [Maximum Subarray<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/maximum-subarray)
    1.  [Jump Game<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/jump-game)
    1.  [Jump Game II<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/jump-game-ii)
    1.  Gas Station<sup for="medium"></sup>
    1.  Hand of Straights<sup for="medium"></sup>
    1.  Merge Triplets to Form Target Triplet<sup for="medium"></sup>
    1.  Partition Labels<sup for="medium"></sup>
    1.  Valid Parenthesis String<sup for="medium"></sup>
  - Intervals
    1.  Insert Interval<sup for="medium"></sup>
    1.  [Merge Intervals<sup for="medium"></sup>](https://hanggrian.github.io/grind-leetcode/merge-intervals)
    1.  Non Overlapping Intervals<sup for="medium"></sup>
    1.  Meeting Rooms<sup for="easy"></sup>
    1.  Meeting Rooms II<sup for="medium"></sup>
    1.  Minimum Interval to Include Each Query<sup for="hard"></sup>
  - Math & Geometry
    1.  Rotate Image<sup for="medium"></sup>
    1.  Spiral Matrix<sup for="medium"></sup>
    1.  Set Matrix Zeroes<sup for="medium"></sup>
    1.  Happy Number<sup for="easy"></sup>
    1.  [Plus One<sup for="easy"></sup>](https://hanggrian.github.io/grind-leetcode/plus-one)
    1.  Pow(x, n)<sup for="medium"></sup>
    1.  Multiply Strings<sup for="medium"></sup>
    1.  Detect Squares<sup for="medium"></sup>
  - Bit Manipulation
    1.  [Single Number<sup for="easy"></sup>](https://hanggrian.github.io/grind-leetcode/single-number)
    1.  Number of 1 Bits<sup for="easy"></sup>
    1.  Counting Bits<sup for="easy"></sup>
    1.  Reverse Bits<sup for="easy"></sup>
    1.  Missing Number<sup for="easy"></sup>
    1.  Sum of Two Integers<sup for="medium"></sup>
    1.  [**Reverse Integer<sup for="medium"></sup>**](https://hanggrian.github.io/grind-leetcode/reverse-integer)
  </details>
</blockquote>

### Official listing

<table>
  <thead>
    <tr>
      <th style="text-align: center;">1-50</th>
      <th style="text-align: center;">51-100</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/two-sum">
          <b>
            1. Two Sum<sup for="easy"></sup>
          </b>
        </a>
      </td>
      <td>51. N-Queens<sup for="hard"></sup></td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/add-two-numbers">
          <b>
            2. Add Two Numbers<sup for="medium"></sup>
          </b>
        </a>
      </td>
      <td>
        52. N-Queens II<sup for="hard"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/longest-substring-without-repeating-characters">
          <b>
            3. Longest Substring Without Repeating Characters<sup for="medium"></sup>
          </b>
        </a>
      </td>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/maximum-subarray">
          53. Maximum Subarray<sup for="medium"></sup>
        </a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/median-of-two-sorted-arrays">
          <b>
            4. Median of Two Sorted Arrays<sup for="hard"></sup>
          </b>
        </a>
      </td>
      <td>54. Spiral Matrix<sup for="medium"></sup></td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/longest-palindromic-substring">
          5. Longest Palindromic Substring<sup for="medium"></sup>
        </a>
      </td>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/jump-game">
          55. Jump Game<sup for="medium"></sup>
        </a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/zigzag-conversion">
          <b>
            6. Zigzag Conversion<sup for="medium"></sup>
          </b>
        </a>
      </td>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/merge-intervals">
          56. Merge Intervals<sup for="medium"></sup>
        </a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/reverse-integer">
          <b>
            7. Reverse Integer<sup for="medium"></sup>
          </b>
        </a>
      </td>
      <td>
        57. Insert Interval<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/string-to-integer-atoi">
          <b>
            8. String to Integer (atoi)<sup for="medium"></sup>
          </b>
        </a>
      </td>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/length-of-last-word">
          58. Length of Last Word<sup for="easy"></sup>
        </a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/palindrome-number">
          <b>
            9. Palindrome Number<sup for="easy"></sup>
          </b>
        </a>
      </td>
      <td>
        59. Spiral Matrix II<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        10. Regular Expression Matching<sup for="hard"></sup>
      </td>
      <td>
        60. Permutation Sequence<sup for="hard"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/container-with-most-water">
          <b>
            11. Container With Most Water<sup for="medium"></sup>
          </b>
        </a>
      </td>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/rotate-list">
          61. Rotate List<sup for="medium"></sup>
        </a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/integer-to-roman">
          <b>
            12. Integer to Roman<sup for="medium"></sup>
          </b>
        </a>
      </td>
      <td>
        62. Unique Paths<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/roman-to-integer">
          <b>
            13. Roman to Integer<sup for="easy"></sup>
          </b>
        </a>
      </td>
      <td>
        63. Unique Paths II<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/longest-common-prefix">
          <b>
            14. Longest Common Prefix<sup for="easy"></sup>
          </b>
        </a>
      </td>
      <td>
        64. Minimum Path Sum<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/three-sum">
          <b>
            15. Three Sum<sup for="medium"></sup>
          </b>
        </a>
      </td>
      <td>
        65. Valid Number<sup for="hard"></sup>
      </td>
    </tr>
    <tr>
      <td>
        16. Three Sum Closest<sup for="medium"></sup>
      </td>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/plus-one">
          66. Plus One<sup for="easy"></sup>
        </a>
      </td>
    </tr>
    <tr>
      <td>
        17. Letter Combinations of a Phone Number<sup for="medium"></sup>
      </td>
      <td>
        67. Add Binary<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        18. Four Sum<sup for="medium"></sup>
      </td>
      <td>
        68. Text Justification<sup for="hard"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/remove-nth-node-from-end-of-list">
          <b>
            19. Remove Nth Node From End of List<sup for="medium"></sup>
          </b>
        </a>
      </td>
      <td>
        69. Sqrt(x)<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/valid-parentheses">
          <b>
            20. Valid Parentheses<sup for="easy"></sup>
          </b>
        </a>
      </td>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/climbing-stairs">
          70. Climbing Stairs<sup for="easy"></sup>
        </a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/merge-two-sorted-lists">
          <b>
            21. Merge Two Sorted Lists<sup for="easy"></sup>
          </b>
        </a>
      </td>
      <td>
        71. Simplify Path<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        22. Generate Parentheses<sup for="medium"></sup>
      </td>
      <td>
        72. Edit Distance<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/merge-k-sorted-lists">
          <b>
            23. Merge k Sorted Lists<sup for="hard"></sup>
          </b>
        </a>
      </td>
      <td>
        73. Set Matrix Zeroes<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/swap-nodes-in-pairs">
          <b>
            24. Swap Nodes in Pairs<sup for="medium"></sup>
          </b>
        </a>
      </td>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/search-a-2d-matrix">
          74. Search a 2D Matrix<sup for="medium"></sup>
        </a>
      </td>
    </tr>
    <tr>
      <td>
        25. Reverse Nodes in k-Group<sup for="hard"></sup>
      </td>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/sort-colors">
          75. Sort Colors<sup for="medium"></sup>
        </a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/remove-duplicates-from-sorted-array">
          <b>
            26. Remove Duplicates from Sorted Array<sup for="easy"></sup>
          </b>
        </a>
      </td>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/minimum-window-substring">
          76. Minimum Window Substring<sup for="hard"></sup>
        </a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/remove-element">
          <b>
            27. Remove Element<sup for="easy"></sup>
          </b>
        </a>
      </td>
      <td>
        77. Combinations<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/find-the-index-of-the-first-occurrence-in-a-string">
          <b>
            28. Find the Index of the First Occurrence in a String<sup for="easy"></sup>
          </b>
        </a>
      </td>
      <td>
        78. Subsets<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        29. Divide Two Integers<sup for="medium"></sup>
      </td>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/word-search">
          79. Word Search<sup for="medium"></sup>
        </a>
      </td>
    </tr>
    <tr>
      <td>
        30. Substring with Concatenation of All Words<sup for="hard"></sup>
      </td>
      <td>
        80. Remove Duplicates from Sorted Array II<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        31. Next Permutation<sup for="medium"></sup>
      </td>
      <td>
        81. Search in Rotated Sorted Array II<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        32. Longest Valid Parentheses<sup for="hard"></sup>
      </td>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/remove-duplicates-from-sorted-list-ii">
          82. Remove Duplicates from Sorted List II<sup for="medium"></sup>
        </a>
      </td>
    </tr>
    <tr>
      <td>
        33. Search in Rotated Sorted Array<sup for="medium"></sup>
      </td>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/remove-duplicates-from-sorted-list">
          83. Remove Duplicates from Sorted List<sup for="easy"></sup>
        </a>
      </td>
    </tr>
    <tr>
      <td>
        34. Find First and Last Position of Element in Sorted Array<sup for="medium"></sup>
      </td>
      <td>
        84. Largest Rectangle in Histogram<sup for="hard"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/search-insert-position">
          <b>
            35. Search Insert Position<sup for="easy"></sup>
          </b>
        </a>
      </td>
      <td>
        85. Maximal Rectangle<sup for="hard"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/valid-sudoku">
          <b>
            36. Valid Sudoku<sup for="medium"></sup>
          </b>
        </a>
      </td>
      <td>
        86. Partition List<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        37. Sudoku Solver<sup for="hard"></sup>
      </td>
      <td>
        87. Scramble String<sup for="hard"></sup>
      </td>
    </tr>
    <tr>
      <td>
        38. Count and Say<sup for="medium"></sup>
      </td>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/merge-sorted-array">
          88. Merge Sorted Array<sup for="easy"></sup>
        </a>
      </td>
    </tr>
    <tr>
      <td>
        39. Combination Sum<sup for="medium"></sup>
      </td>
      <td>
        89. Gray Code<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        40. Combination Sum II<sup for="medium"></sup>
      </td>
      <td>
        90. Subsets II<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        41. First Missing Positive<sup for="hard"></sup>
      </td>
      <td>
        91. Decode Ways<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/trapping-rain-water">
          42. Trapping Rain Water<sup for="hard"></sup>
        </a>
      </td>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/reverse-linked-list-ii">
          92. Reverse Linked List II<sup for="hard"></sup>
        </a>
      </td>
    </tr>
    <tr>
      <td>
        43. Multiply Strings<sup for="medium"></sup>
      </td>
      <td>
        93. Restore IP Addresses<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        44. Wildcard Matching<sup for="hard"></sup>
      </td>
      <td>
        94. Binary Tree Inorder Traversal<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/jump-game-ii">
          45. Jump Game II<sup for="medium"></sup>
        </a>
      </td>
      <td>
        95. Unique Binary Search Trees II<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/trapping-rain-water">
          46. Permutations<sup for="medium"></sup>
        </a>
      </td>
      <td>
        96. Unique Binary Search Trees<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        47. Permutations II<sup for="medium"></sup>
      </td>
      <td>
        97. Interleaving String<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        48. Rotate Image<sup for="medium"></sup>
      </td>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/validate-binary-search-tree">
          98. Validate Binary Search Tree<sup for="medium"></sup>
        </a>
      </td>
    </tr>
    <tr>
      <td>
        49. Group Anagrams<sup for="medium"></sup>
      </td>
      <td>
        99. Recover Binary Search Tree<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        50. Pow(x, n)<sup for="medium"></sup>
      </td>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/same-tree">
          100. Same Tree<sup for="easy"></sup>
        </a>
      </td>
    </tr>
    <tr>
      <td style="text-align: center;"><b>101-150</b></td>
      <td style="text-align: center;"><b>151-200</b></td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/symmetric-tree">
          101. Symmetric Tree<sup for="easy"></sup>
        </a>
      </td>
      <td>
        151. Reverse Words in a String<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/binary-tree-level-order-traversal">
          102. Binary Tree Level Order Traversal<sup for="medium"></sup>
        </a>
      </td>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/maximum-product-subarray">
          152. Maximum Product Subarray<sup for="medium"></sup>
        </a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/binary-tree-zigzag-level-order-traversal">
          103. Binary Tree Zigzag Level Order Traversal<sup for="medium"></sup>
        </a>
      </td>
      <td>
        153. Find Minimum in Rotated Sorted Array<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/maximum-depth-of-binary-tree">
          104. Maximum Depth of Binary Tree<sup for="easy"></sup>
        </a>
      </td>
      <td>
        154. Find Minimum in Rotated Sorted Array II<sup for="hard"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/construct-binary-tree-from-preorder-and-inorder-traversal">
          105. Construct Binary Tree from Preorder and Inorder Traversal<sup for="medium"></sup>
        </a>
      </td>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/min-stack">
          155. Min Stack<sup for="medium"></sup>
        </a>
      </td>
    </tr>
    <tr>
      <td>
        106. Construct Binary Tree from Inorder and Postorder Traversal<sup for="medium"></sup>
      </td>
      <td>
        <s>
          156. Binary Tree Upside Down<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        107. Binary Tree Level Order Traversal II<sup for="medium"></sup>
      </td>
      <td>
        <s>
          157. Read N Characters Given Read4<sup for="easy"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        108. Convert Sorted Array to Binary Search Tree<sup for="easy"></sup>
      </td>
      <td>
        <s>
          158. Read N Characters Given Read4 II<sup for="hard"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        109. Convert Sorted List to Binary Search Tree<sup for="medium"></sup>
      </td>
      <td>
        <s>
          159. Longest Substring with At Most Two Distinct Characters<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/balanced-binary-tree">
          110. Balanced Binary Tree<sup for="easy"></sup>
        </a>
      </td>
      <td>
        160. Intersection of Two Linked Lists<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        111. Minimum Depth of Binary Tree<sup for="easy"></sup>
      </td>
      <td>
        <s>
          161. One Edit Distance<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/path-sum">
          112. Path Sum<sup for="easy"></sup>
        </a>
      </td>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/find-peak-element">
          162. Find Peak Element<sup for="medium"></sup>
        </a>
      </td>
    </tr>
    <tr>
      <td>
        113. Path Sum II<sup for="medium"></sup>
      </td>
      <td>
        <s>
          163. Missing Ranges<sup for="easy"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        114. Flatten Binary Tree to Linked List<sup for="medium"></sup>
      </td>
      <td>
        164. Maximum Gap<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        115. Distinct Subsequences<sup for="hard"></sup>
      </td>
      <td>
        165. Compare Version Numbers<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        116. Populating Next Right Pointers in Each Node<sup for="medium"></sup>
      </td>
      <td>
        166. Fraction to Recurring Decimal<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        117. Populating Next Right Pointers in Each Node II<sup for="medium"></sup>
      </td>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/two-sum-ii-input-array-is-sorted">
          167. Two Sum II - Input Array Is Sorted<sup for="medium"></sup>
        </a>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/pascals-triangle">
          118. Pascal's Triangle<sup for="easy"></sup>
        </a>
      </td>
      <td>
        168. Excel Sheet Column Title<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/pascals-triangle-ii">
          119. Pascal's Triangle II<sup for="easy"></sup>
        </a>
      </td>
      <td>
        169. Majority Element<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/triangle">
          120. Triangle<sup for="medium"></sup>
        </a>
      </td>
      <td>
        <s>
          170. Two Sum III - Data structure design<sup for="easy"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/best-time-to-buy-and-sell-stock">
          121. Best Time to Buy and Sell Stock<sup for="easy"></sup>
        </a>
      </td>
      <td>
        171. Excel Sheet Column Number<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/best-time-to-buy-and-sell-stock-ii">
          122. Best Time to Buy and Sell Stock<sup for="medium"></sup>
        </a>
      </td>
      <td>
        172. Factorial Trailing Zeroes<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        123. Best Time to Buy and Sell Stock III<sup for="hard"></sup>
      </td>
      <td>
        173. Binary Search Tree Iterator<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        124. Binary Tree Maximum Path Sum<sup for="hard"></sup>
      </td>
      <td>
        174. Dungeon Game<sup for="hard"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/valid-palindrome">
          <b>
            125. Valid Palindrome<sup for="easy"></sup>
          </b>
        </a>
      </td>
      <td>
        175. Combine Two Tables<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        126. Word Ladder II<sup for="hard"></sup>
      </td>
      <td>
        176. Second Highest Salary<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/word-ladder">
          127. Word Ladder<sup for="hard"></sup>
        </a>
      </td>
      <td>
        177. Nth Highest Salary<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        128. Longest Consecutive Sequence<sup for="medium"></sup>
      </td>
      <td>
        178. Rank Scores<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        129. Sum Root to Leaf Numbers<sup for="medium"></sup>
      </td>
      <td>
        179. Largest Number<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        130. Surrounded Regions<sup for="medium"></sup>
      </td>
      <td>
        180. Consecutive Numbers<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        131. Palindrome Partitioning<sup for="medium"></sup>
      </td>
      <td>
        181. Employees Earning More Than Their Managers<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        132. Palindrome Partitioning II<sup for="hard"></sup>
      </td>
      <td>
        182. Duplicate Emails<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        133. Clone Graph<sup for="medium"></sup>
      </td>
      <td>
        183. Customers Who Never Order<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        134. Gas Station<sup for="medium"></sup>
      </td>
      <td>
        184. Department Highest Salary<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        135. Candy<sup for="hard"></sup>
      </td>
      <td>
        185. Department Top Three Salaries<sup for="hard"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/single-number">
          136. Single Number<sup for="easy"></sup>
        </a>
      </td>
      <td>
        <s>
          186. Reverse Words in a String II<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        137. Single Number II<sup for="medium"></sup>
      </td>
      <td>
        187. Repeated DNA Sequences<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        138. Copy List with Random Pointer<sup for="medium"></sup>
      </td>
      <td>
        188. Best Time to Buy and Sell Stock IV<sup for="hard"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/word-break">
          139. Word Break<sup for="medium"></sup>
        </a>
      </td>
      <td>
        189. Rotate Array<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/word-break-ii">
          140. Word Break II<sup for="hard"></sup>
        </a>
      </td>
      <td>
        190. Reverse Bits<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/linked-list-cycle">
          <b>
            141. Linked List Cycle<sup for="easy"></sup>
          </b>
        </a>
      </td>
      <td>
        191. Number of 1 Bits<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/linked-list-cycle-ii">
          142. Linked List Cycle II<sup for="medium"></sup>
        </a>
      </td>
      <td>
        192. Word Frequency<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/reorder-list">
          143. Reorder List<sup for="medium"></sup>
        </a>
      </td>
      <td>
        193. Valid Phone Numbers<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        144. Binary Tree Preorder Traversal<sup for="easy"></sup>
      </td>
      <td>
        194. Transpose File<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        145. Binary Tree Postorder Traversal<sup for="easy"></sup>
      </td>
      <td>
        195. Tenth Line<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/lru-cache">
          146. LRU Cache<sup for="medium"></sup>
        </a>
      </td>
      <td>
        196. Delete Duplicate Emails<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        147. Insertion Sort List<sup for="medium"></sup>
      </td>
      <td>
        197. Rising Temperature<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/sort-list">
          148. Sort List<sup for="medium"></sup>
        </a>
      </td>
      <td>
        198. House Robber<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        149. Max Points on a Line<sup for="hard"></sup>
      </td>
      <td>
        199. Binary Tree Right Side View<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        150. Evaluate Reverse Polish Notation<sup for="medium"></sup>
      </td>
      <td>
        200. Number of Islands<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td style="text-align: center;"><b>201-250</b></td>
      <td style="text-align: center;"><b>251-300</b></td>
    </tr>
    <tr>
      <td>
        201. 201. Bitwise AND of Numbers Range<sup for="medium"></sup>
      </td>
      <td>
        <s>
          251. Flatten 2D Vector<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        202. Happy Number<sup for="easy"></sup>
      </td>
      <td>
        <s>
          252. Meeting Rooms<sup for="easy"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        203. Remove Linked List Elements<sup for="easy"></sup>
      </td>
      <td>
        <s>
          253. Meeting Rooms II<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        204. Count Primes<sup for="medium"></sup>
      </td>
      <td>
        <s>
          254. Factor Combinations<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        205. Isomorphic Strings<sup for="easy"></sup>
      </td>
      <td>
        <s>
          255. Verify Preorder Sequence in Binary Search Tree<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        206. Reverse Linked List<sup for="easy"></sup>
      </td>
      <td>
        <s>
          256. Paint House<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        207. Course Schedule<sup for="medium"></sup>
      </td>
      <td>
        257. Binary Tree Paths<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        208. Implement Trie (Prefix Tree)<sup for="medium"></sup>
      </td>
      <td>
        258. Add Digits<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        209. Minimum Size Subarray Sum<sup for="medium"></sup>
      </td>
      <td>
        <s>
          259. Three Sum Smaller<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        210. Course Schedule II<sup for="medium"></sup>
      </td>
      <td>
        260. Single Number III<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        211. Design Add and Search Words Data Structure<sup for="medium"></sup>
      </td>
      <td>
        <s>
          261. Graph Valid Tree<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        212. Word Search II<sup for="hard"></sup>
      </td>
      <td>
        262. Trips and Users<sup for="hard"></sup>
      </td>
    </tr>
    <tr>
      <td>
        213. House Robber II<sup for="medium"></sup>
      </td>
      <td>
        263. Ugly Number<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        214. Shortest Palindrome<sup for="hard"></sup>
      </td>
      <td>
        264. Ugly Number II<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        215. Kth Largest Element in an Array<sup for="medium"></sup>
      </td>
      <td>
        <s>
          265. Paint House II<sup for="hard"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        216. Combination Sum III<sup for="medium"></sup>
      </td>
      <td>
        <s>
          266. Palindrome Permutation<sup for="easy"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        217. Contains Duplicate<sup for="easy"></sup>
      </td>
      <td>
        <s>
          267. Palindrome Permutation II<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        218. The Skyline Problem<sup for="hard"></sup>
      </td>
      <td>
        268. Missing Number<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        219. Contains Duplicate II<sup for="easy"></sup>
      </td>
      <td>
        <s>
          269. Alien Dictionary<sup for="hard"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        220. Contains Duplicate III<sup for="hard"></sup>
      </td>
      <td>
        <s>
          270. Closest Binary Search Tree Value<sup for="easy"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        221. Maximal Square<sup for="medium"></sup>
      </td>
      <td>
        <s>
          271. Encode and Decode Strings<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        222. Count Complete Tree Nodes<sup for="easy"></sup>
      </td>
      <td>
        <s>
          272. Closest Binary Search Tree Value II<sup for="hard"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        223. Rectangle Area<sup for="medium"></sup>
      </td>
      <td>
        273. Integer to English Words<sup for="hard"></sup>
      </td>
    </tr>
    <tr>
      <td>
        224. Basic Calculator<sup for="hard"></sup>
      </td>
      <td>
        274. H-Index<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        225. Implement Stack using Queues<sup for="easy"></sup>
      </td>
      <td>
        275. H-Index II<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <a href="https://hanggrian.github.io/grind-leetcode/invert-binary-tree">
          <b>
            226. Invert Binary Tree<sup for="easy"></sup>
          </b>
        </a>
      </td>
      <td>
        <s>
          276. Paint Fence<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        227. Basic Calculator II<sup for="medium"></sup>
      </td>
      <td>
        <s>
          277. Find the Celebrity<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        228. Summary Ranges<sup for="easy"></sup>
      </td>
      <td>
        278. First Bad Version<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        229. Majority Element II<sup for="medium"></sup>
      </td>
      <td>
        279. Perfect Squares<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        230. Kth Smallest Element in a BST<sup for="medium"></sup>
      </td>
      <td>
        <s>
          280. Wiggle Sort<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        231. Power of Two<sup for="easy"></sup>
      </td>
      <td>
        <s>
          281. Zigzag Iterator<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        232. Implement Queue using Stacks<sup for="easy"></sup>
      </td>
      <td>
        282. Expression Add Operators<sup for="hard"></sup>
      </td>
    </tr>
    <tr>
      <td>
        233. Number of Digit One<sup for="hard"></sup>
      </td>
      <td>
        283. Move Zeroes<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        234. Palindrome Linked List<sup for="easy"></sup>
      </td>
      <td>
        284. Peeking Iterator<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        235. Lowest Common Ancestor of a Binary Search Tree<sup for="medium"></sup>
      </td>
      <td>
        <s>
          285. Inorder Successor in BST<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        236. Lowest Common Ancestor of a Binary Tree<sup for="medium"></sup>
      </td>
      <td>
        <s>
          286. Walls and Gates<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        237. Delete Node in a Linked List<sup for="medium"></sup>
      </td>
      <td>
        287. Find the Duplicate Number<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        238. Product of Array Except Self<sup for="medium"></sup>
      </td>
      <td>
        <s>
          288. Unique Word Abbreviation<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        239. Sliding Window Maximum<sup for="hard"></sup>
      </td>
      <td>
        289. Game of Life<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        240. Search a 2D Matrix II<sup for="medium"></sup>
      </td>
      <td>
        290. Word Pattern<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        241. Different Ways to Add Parentheses<sup for="medium"></sup>
      </td>
      <td>
        <s>
          291. Word Pattern II<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        242. Valid Anagram<sup for="easy"></sup>
      </td>
      <td>
        292. Nim Game<sup for="easy"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <s>
          243. Shortest Word Distance<sup for="easy"></sup>
        </s>
      </td>
      <td>
        <s>
          293. Flip Game<sup for="easy"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        <s>
          244. Shortest Word Distance II<sup for="medium"></sup>
        </s>
      </td>
      <td>
        <s>
          294. Flip Game II<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        <s>
          245. Shortest Word Distance III<sup for="medium"></sup>
        </s>
      </td>
      <td>
        295. Find Median from Data Stream<sup for="hard"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <s>
          246. Strobogrammatic Number<sup for="easy"></sup>
        </s>
      </td>
      <td>
        <s>
          296. Best Meeting Point<sup for="hard"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        <s>
          247. Strobogrammatic Number II<sup for="medium"></sup>
        </s>
      </td>
      <td>
        297. Serialize and Deserialize Binary Tree<sup for="hard"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <s>
          248. Strobogrammatic Number III<sup for="hard"></sup>
        </s>
      </td>
      <td>
        <s>
          298. Binary Tree Longest Consecutive Sequence<sup for="medium"></sup>
        </s>
      </td>
    </tr>
    <tr>
      <td>
        <s>
          249. Group Shifted Strings<sup for="medium"></sup>
        </s>
      </td>
      <td>
        299. Bulls and Cows<sup for="medium"></sup>
      </td>
    </tr>
    <tr>
      <td>
        <s>
          250. Count Univalue Subtrees<sup for="medium"></sup>
        </s>
      </td>
      <td>
        300. Longest Increasing Subsequence<sup for="medium"></sup>
      </td>
    </tr>
  </tbody>
</table>
