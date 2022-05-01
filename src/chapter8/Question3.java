package chapter8;

public class Question3 {

	int getMagicIdx(int[] arr) {
		return getMagicIdx(arr, 0, arr.length - 1);
	}

	private int getMagicIdx(int[] arr, int s, int e) {
		if (e < s) {
			return -1;
		}
		int m = (s + e) / 2;
		if (arr[m] == m) {
			return m;
		} else if (arr[m] > m) {
			return getMagicIdx(arr, s, m - 1);
		} else {
			return getMagicIdx(arr, m + 1, e);
		}

	}

	// If the values are not distinct

	int getMagicIdxDistinct(int[] arr) {
		return getMagicIdxDistinct(arr, 0, arr.length - 1);
	}

	int getMagicIdxDistinct(int[] arr, int s, int e) {
		if (e < s) {
			return -1;
		}

		int mIdx = (s + e) / 2;
		int mVal = arr[mIdx];
		if (mVal == mIdx) {
			return mIdx;
		}

		// Check left
		int leftIdx = Math.min(mIdx - 1, mVal);
		int left = getMagicIdxDistinct(arr, s, leftIdx);
		if (left >= 0) {
			return left;
		}

		// Check right
		int rightIdx = Math.max(mIdx + 1, mVal);
		int right = getMagicIdxDistinct(arr, rightIdx, e);

		return right;

	}

}
