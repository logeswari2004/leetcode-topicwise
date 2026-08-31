import os
import shutil
import subprocess

SOURCE_REPO = r"C:\LeetCodeAutomation\java-dsa-leetcode"
TARGET_REPO = r"C:\LeetCodeAutomation\leetcode-topicwise"

TOPICS = {
    "Arrays": [
        "two-sum",
        "best-time-to-buy-and-sell-stock",
        "product-of-array-except-self",
        "rotate-array",
        "move-zeroes"
    ],

    "Strings": [
        "valid-palindrome",
        "reverse-words-in-a-string",
        "longest-common-prefix",
        "isomorphic-strings"
    ],

    "LinkedList": [
        "add-two-numbers",
        "reverse-linked-list",
        "merge-two-sorted-lists",
        "linked-list-cycle"
    ],

    "Trees": [
        "maximum-depth-of-binary-tree",
        "lowest-common-ancestor-of-a-binary-tree",
        "path-sum-iii"
    ],

    "Stack": [
        "valid-parentheses",
        "decode-string",
        "daily-temperatures",
        "asteroid-collision"
    ],

    "SlidingWindow": [
        "maximum-average-subarray-i",
        "minimum-size-subarray-sum",
        "longest-substring-without-repeating-characters"
    ],

    "BinarySearch": [
        "binary-search",
        "find-peak-element",
        "search-in-rotated-sorted-array"
    ]
}

for folder in os.listdir(SOURCE_REPO):

    src_folder = os.path.join(SOURCE_REPO, folder)

    if not os.path.isdir(src_folder):
        continue

    folder_lower = folder.lower()

    for topic, keywords in TOPICS.items():

        for keyword in keywords:

            if keyword in folder_lower:

                target = os.path.join(TARGET_REPO, topic)

                os.makedirs(target, exist_ok=True)

                shutil.copytree(
                    src_folder,
                    os.path.join(target, folder),
                    dirs_exist_ok=True
                )

                print(f"Copied {folder} -> {topic}")

                break

os.chdir(TARGET_REPO)

subprocess.run(["git", "add", "."])
subprocess.run(["git", "commit", "-m", "Auto update LeetCode solutions"])
subprocess.run(["git", "push"])

print("Done!")