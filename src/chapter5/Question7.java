package chapter5;

public class Question7 {

	int swap(int x) {
		// mask all odd bits and then shift right by 1 and then mask all even bits and shift left by 1
		return (((x & 0xaaaaaaaa) >>> 1) | ((x & 0x55555555) << 1)); 
	}
	
}


