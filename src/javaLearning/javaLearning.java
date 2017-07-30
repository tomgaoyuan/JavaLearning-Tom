package javaLearning;

import java.util.*;

public class javaLearning{
	static public void main (String argv[] ) {
		//Java syntax testing
		//char[][] b = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		//System.out.println(exist(b,"SEE"));
		//String[] strs = new String[]{"aac","acab","aa","abba","aa"};
		//System.out.println(longestCommonPrefix(strs));
		//int[] nums = new int[] {5,1,2,3,4};//{5,3,2,1,4};
		//System.out.println(findPos(nums));
		//System.out.println( reverseOrderNum("DBBAC") );
		//MyTree.buildTree(new Integer[]{1,null,2});
		//MyTree.printTreeDLR();
		//MyTree.printTreeLRD();
		//MyTree.buildTree(new Integer[]{3,9,20,null,null,15,7});
		//System.out.println( levelOrderBottom(MyTree.root) );
		//sortedArrayToBST(new int[]{1,2,3,4,5});
		//MyTree.buildTree(new Integer[]{1,2});
		//isBalanced(MyTree.root);
		//System.out.println(generate(5));
		//System.out.println(maxProfit(new int[] {7,6,4,3,1}));
		//System.out.println(getRow(5));
		//System.out.println(maxProfit2(new int[] {4,3,2,1}));
		//System.out.println(isPalindrome(new String("A man, a plan, a canal: Panama")));
		//System.out.println(singleNumber(new int[] {1}));
		//MyLinkedList.buildLinkedList(new int[] {1,2,3,4,5});
		//MyLinkedList.printLinkedList();
		//System.out.println(hasCycle(MyLinkedList.head));
		//MinStack s = new MinStack();
		//s.push(2); s.push(1);
		//System.out.println(s.top());
		//System.out.println(s.getMin());
		//MyLinkedList.buildLinkedList(new int[] {1,2,3,4,5}, 0);
		//System.out.print(twoSum2(new int[] {2,7,11,15},10));
		//System.out.println(convertToTitle(26));
		//System.out.println(titleToNumber("AA"));
		//System.out.println(trailingZeroes(2));
		//System.out.println(majorityElement(new int[] {3,3,4,3}));
		//int[] nums = new int[]{1,2,3,4,5,6,7};
		//rotate(nums, 3);
		//System.out.println(Arrays.toString(nums));
		//int n = 43261596;
		//String s = new String("0000"); s += s; s += s; s += s;
		//String s1 = Integer.toBinaryString(n);
		//System.out.println( s.substring(0,32-s1.length()) + s1 );
		//s1 = Integer.toBinaryString(reverseBits(n));
		//System.out.println( s.substring(0,32-s1.length()) + s1 );
		//System.out.println(hammingWeight(-2));
		//System.out.println(mySqrt2(36));
		//System.out.println(rob(new int[]{1,2,3}));
		//System.out.println(isHappy(7));
		//MyLinkedList.buildLinkedList(new int[]{1,2,6,3,4,5,6});
		//System.out.println(removeElements(MyLinkedList.head, 6));
		//MyLinkedList.printLinkedList();
		//System.out.println(isIsomorphic(new String("ab"), new String("aa")));
		//MyLinkedList.buildLinkedList(new int[]{1});
		//reverseList(MyLinkedList.head.next);
		//System.out.println(containsDuplicate(new int[]{1,2,1}));
		//System.out.println(containsNearbyDuplicate(new int[]{1,2,1},1));
		//MyTree.buildTree(new Integer[]{4,2,7,1,3,6,9});
		//invertTree(MyTree.root);
		//MyTree.printTreeDLR();
		//System.out.println(isPowerOfTwo(64));
		//MyLinkedList.buildLinkedList(new int[]{1});
		//System.out.println(isPalindrome(MyLinkedList.head.next));	
		//MyLinkedList.buildLinkedList(new int[]{1,2,3});
		//deleteNode(MyLinkedList.head.next.next);
		//MyLinkedList.printLinkedList();
		//MyStack s = new MyStack();
		//s.push(1); s.push(2);
		//System.out.println(s.top());
		//System.out.println(s.pop());
		//s.push(3);
		//System.out.println(s.pop());
		//MyQueue q = new MyQueue();
		//q.push(1); q.push(2);q.push(3);
		//System.out.println(q.pop());
		//System.out.println(isAnagram("anagram", "nagaram"));
		//System.out.println(addDigits(38));
		//System.out.println(isUgly(8));
		//System.out.println(missingNumber(new int[]{0}));
		//isBadVersionList = new int[]{1,1,0,0,0}; // 1:good, 0:bad
		//System.out.print(firstBadVersion(isBadVersionList.length));
		//int[] nums = new int[] {0,1,0,1,0,0};
		//moveZeroes(nums);
		//System.out.println(Arrays.toString(nums));
		//System.out.println(wordPattern("abba","dog dog dog dog"));
		//System.out.println(canWinNim(5));
		System.out.println(countPrimes(9));
	}
	private static int[] isBadVersionList;
	@SuppressWarnings("unused")
	public static void syntaxTest() {
		System.out.println("Hello world!");
//An input demo
		boolean inputYN = false;
		if (inputYN) {
			Scanner in = new Scanner(System.in);
			System.out.println("Who are you?");
			String name = in.nextLine();
			System.out.println(name);
			in.close();
		}
//An array demo
		int[] a = new int[4];
//Array can not be resized
		for (int i : a)
			System.out.println(i);
		a = new int[]{1,2,3,4};
		for (int i : a)
			System.out.println(i);
		int[] a2 = Arrays.copyOf(a, a.length);
		a2[0]++;
		for (int i : a2)
			System.out.println(i);
		int[][] b = new int[2][];
		for (int i=0; i<b.length; i++)
			b[i] = new int[i+1];
		for (int i=0; i<b.length; i++){
			for (int j=0; j<b[i].length; j++)
				System.out.print(b[i][j]);
			System.out.print('\n');
		}
		System.out.println("Quiting");		
	}
	@SuppressWarnings("unused")
	public static int[] twoSum(int[] nums, int target){
		int[] re = new int[2];
		//search
		for(int l1=0; l1<nums.length; l1++) {
			for(int l2=l1+1; l2<nums.length; l2++){
				if (nums[l1]+nums[l2]==target) {
					re[0] = l1;
					re[1] = l2;
					return re;
				}
			}
		}
		return re;
	}
	public static String ZigzagCov(String s, int numRows) {
		if (numRows ==1) return s;
		int lth = s.length();
		char[] re = new char[lth];
		int[][] idx = new int[numRows][];
		for(int c=0; c<numRows; c++)
			idx[c] = new int[lth];
		int x=0, y=0;
		for(int c=1; c<=lth; c++ ){
			idx[y][x] = c;
			if (x % 2 ==0) {
				if (y==numRows-1){
					x++;
					y--;
				}else
					y++;
			}else {
				if (y==0) {
					x++;
					y++;
				}else 
					y--;
			}
		}
		int c = 0 ;
		for(int c1 = 0; c1 < numRows; c1++)
			for(int c2 = 0; c2 < lth; c2++){
				if(idx[c1][c2]==0)
					continue;
				else{
					re[c] = s.charAt(idx[c1][c2]-1);
					c++;
				}
			}
		return new String(re);
	}
	public static int reverse(int x) {
		int bit;
		long re=0;
		while (x != 0) {
			bit = x % 10;
			re = re * 10 +bit;
			x /= 10;
		}
		if (re > Integer.MAX_VALUE || re < Integer.MIN_VALUE)
			return 0;
		else 
			return (int) re;
	}
	public static boolean isPalindrome(int x) {
		int top=1;
		while(x / top /10 != 0)
			top *= 10;
		int bottom = 1;
		while(top > bottom){
			if ( x/top != x /bottom % 10 )
				return false;
			x -= x/top * top;
			x -= x / bottom % 10 * bottom;
			top /= 10;
			bottom *= 10;
		}
		return true;
	}
	public static int romanToInt(String s) {
		int[] trans = new int[s.length()];
		int re = 0;
		for(int c=0; c<s.length(); c++){
			switch (s.codePointAt(c)) {
			case 'I' : trans[c] = 1; break;
			case 'V' : trans[c] = 5; break;
			case 'X' : trans[c] = 10; break;
			case 'L' : trans[c] = 50; break;
			case 'C' : trans[c] = 100; break;
			case 'D' : trans[c] = 500; break;
			case 'M' : trans[c] =1000; break;
			}
		}
		int start=0, end=0;
		boolean contin = false;
		int c = 0;
		while (c<trans.length) {
			if (!contin) {
				contin = true;
				start = c;
				end = c;
				c++;
			}else if(contin && trans[c]==trans[end]){
				end = c;
				c++;
			}
			else if(contin && trans[c]!=trans[end]){
				contin = false;
				if (trans[c] > trans[end])
					for(int cc=start; cc<=end; cc++) trans[cc] *= -1;
				continue;
			}
		}
		for(c = 0; c<trans.length; c++) re+=trans[c];
		return re;
	}
	public static boolean isValid(String s) {
		ArrayList<Integer> stack = new ArrayList<Integer>();
		for (int c=0; c< s.length(); c++) {
			switch (s.codePointAt(c)) {
			case '(' :
				stack.add(1);
				break;
			case '[' :
				stack.add(2);
				break;
			case '{' :
				stack.add(3);
				break;
			case ')' :
				if( stack.size() >0 && stack.remove(stack.size()-1)==1 ) 
					;
				else
					return false;
				break;
			case ']' :
				if( stack.size() >0 && stack.remove(stack.size()-1)==2 ) 
					;
				else
					return false;
				break;	
			case '}' :
				if( stack.size() >0 && stack.remove(stack.size()-1)==3 ) 
					;
				else
					return false;
				break;				
			}
		}
		if (stack.size()==0)
			return true;
		else
			return false;
	}
	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) return 0;
		int begin=nums.length-1, end=nums.length-1;
		for(int c=nums.length-2; c>=-1; c--){
			if( c==-1 || nums[c]!=nums[begin]) {
				if (c+1!=begin && nums[c+1]==nums[begin]){
					for(int cc=1; cc<=end-begin+1; cc++)
						nums[c+cc] = nums[begin+cc-1];
					end = c+1+end-begin;
					begin = c;
				}
				begin = c>=0 ? c : 0;
			}else
				continue;
			
		}
		return end-begin+1;
	}
	public static int removeElement(int[] nums, int val){
		int top = 0;
		for(int c=0; c<nums.length; c++)
			if (nums[c] != val) nums[top++] = nums[c];
		return top;
	}
	public static int strStr(String haystack, String needle){
		int lthH = haystack.length(), lthN = needle.length();
		if(lthH < lthN) return -1;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int c=lthH-lthN; c>=0; c--  )
			map.put(haystack.substring(c, c+lthN),c);
		if(map.get(needle)!=null) return map.get(needle);
		else return -1;
	}
	public static int searchInsert(int[] nums, int target){
		int bottom=0, top=nums.length-1,mid;
		do {
			mid = (bottom+top)/2;
			if(target <= nums[bottom]) top = bottom;
			else if(nums[bottom] < target && target <= nums[mid]) top = mid;
			else if (nums[mid] < target && target <= nums[top]) bottom = mid;
			else return ++top;
		}while(top - bottom > 1);
		if (nums[bottom]==target) return bottom;
		else return top;
	}
	public static String countAndSay(int n){
		if (n==0) return null;
		if (n==1) return new String("1");
		String re = new String("11");
		ArrayList<Character> num = new ArrayList<Character>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		int cnt = 0;
		while (n > 2) {
			num.clear();
			count.clear();
			for(int c=0; c<re.length(); c++){
				if( c==0 ) {
					cnt = 1;
					continue;
				}
				if (re.charAt(c) == re.charAt(c-1)) cnt++;
				else{
					num.add(re.charAt(c-1));
					count.add(cnt);
					cnt = 1;
				}
				if(c==re.length()-1){
					num.add(re.charAt(c));
					count.add(cnt);
					cnt = 0;
				}
			}
			re = "";
			for(int c=0; c<num.size(); c++)
				re += String.valueOf(count.get(c)) + String.valueOf(num.get(c));
			n--;
		}
		return re;
	}
	public static int lengthOfLastWord(String s){
		int count = 0;
		int c;
		for(c = s.length()-1; c >= 0; c--)
			if ( s.charAt(c)!=' ' ) break;
		for(; c>=0 && s.charAt(c)!=' '; c--)
			count ++;
		return count;
	}
    public static int[] plusOne(int[] digits) {
    	boolean flag = true;
    	int re[] = new int[digits.length];
    	for( int c = digits.length -1 ; c >= 0; c--){
    		if (!flag)
    			re[c] = digits[c];
    		else if (digits[c] == 9) {
    			flag = true;
    			re[c] = 0;
    		}else{
    			flag = false;
    			re[c] = digits[c] + 1;
    		}
    	}
    	if(flag) {
    		int[] re2 = new int[re.length+1];
    		re2[0] = 1;
    		for(int c=0; c< re.length; c++)
    			re2[c+1] = re[c];
    		return re2;
    	}else
    		return re;
    }
    public static String addBinary(String a, String b){
    	StringBuilder sb = new StringBuilder();
    	int pa = a.length() -1, pb = b.length() -1;
    	int digit = 0, carry = 0;
    	while (pa >= 0 || pb >= 0 ){
    		if (pa >= 0 && pb >= 0){
    			if (a.charAt(pa)=='0' && b.charAt(pb)=='0') digit = 0;
    			else if (a.charAt(pa)=='1' && b.charAt(pb)=='1') digit =2;
    			else digit = 1;   			
    		}else if (pa >= 0 && pb <0)
    			digit = (int) (a.charAt(pa) - '0');
    		else 
    			digit = (int) (b.charAt(pb) - '0');
    		pa--;
    		pb--;
			sb.append((char)('0' + (digit+carry)%2));
    		carry = (digit+carry)/2;
    		digit = 0;
    	}
    	if (carry!=0) sb.append('1');
    	sb.reverse();
    	return sb.toString();
    }
    public static int mySqrt(int x){
    	// Bugs here
    	if (x==0 || x==1) return x;
    	else if (x==2 || x==3) return 1;
    	else {
    		int re = x/2 +1;
    		while (re > x /re)
    			re--;
    		return re;
    	}	
    }
    public static int climbStairs (int n) {
    	  int pd[] = new int[n];
    	  pd[0] = 1;
    	  pd[1] = 2;
    	  for (int c = 2; c < n; c++)
    	    pd[c] = pd[c-1] + pd[c-2];
    	  return pd[n-1];
    }
    public static boolean exist(char[][] board, String word) {
        HashMap<Character, LinkedList<Integer>> m = new HashMap<Character, LinkedList<Integer>>();
        for(int i=0; i < board.length; i++)
        	for(int j=0; j<board[i].length; j++){
        		if (m.get(board[i][j])==null)
        				m.put(board[i][j], new LinkedList<Integer>());
        		m.get(board[i][j]).add(i);
        		m.get(board[i][j]).add(j);
        	}
        int[] pos = new int[word.length()+1];
        int top = 1;
        int lastx=-1, lasty=-1, x, y;
        LinkedList<Integer> idxUsd = new LinkedList<Integer>();
        do{
        	LinkedList<Integer> idx = m.get(word.charAt(top-1));
        	if (idx != null && pos[top] < idx.size()){
        		if (top==1) {
        			lastx = idx.get(pos[top]);
        			lasty = idx.get(pos[top]+1);
           			idxUsd.add(lastx);
        			idxUsd.add(lasty);        			
        			top++;
        		}else {
        			x = idx.get(pos[top]);
        			y = idx.get(pos[top]+1);
        			int distance = (lastx - x) * (lastx - x) + (lasty - y) * (lasty - y);
        			for( int c=0; c<idxUsd.size(); c+=2 )
        				if (x==idxUsd.get(c) && y==idxUsd.get(c+1)) distance=100;
        			if ( distance <= 1 ){
        					top++;
        					lastx = x;
        					lasty = y;
                			idxUsd.add(lastx);
                			idxUsd.add(lasty);
        			} else {
        				pos[top] += 2;
        			}
        		}
        	}else{
				if(!idxUsd.isEmpty()) {
					idxUsd.removeLast();
					idxUsd.removeLast();
				}
				if(!idxUsd.isEmpty()) {
					lasty = idxUsd.get(idxUsd.size()-1);
					lastx = idxUsd.get(idxUsd.size()-2);
				}else {
					lastx = -1;
					lasty = -1;
				}
				pos[top--] = 0;	
				pos[top] += 2;
        	}
        }while(top>=1 && top<=word.length());
        if (top<1) return false;
        else return true;
    }    
    public static double myPow(double x, int n) {
    	double re = 1.0;
    	if (n==0) ;
    	else if (n > 0)
    		for(; n > 0; n--) re*=x;
    	else
    		for(; n < 0; n++) re /= x;
    	return re;
    }
    public static String longestCommonPrefix(String[] strs) {
    	if (strs.length == 0 ) return "";
    	else if (strs.length == 1) return strs[0];
    	
    	int m1=-1, m2=-1, l1=Integer.MAX_VALUE, l2=Integer.MAX_VALUE;
    	for(int c=0; c<strs.length; c++)
    		if (strs[c].length() <= l1) {
    			l2 = l1;
    			l1 = strs[c].length();
    			m2 = m1;
    			m1 = c;
    		}else if (strs[c].length() > l1 && strs[c].length() <= l2){
    			l2 = strs[c].length();
    			m2 = c;
    		}
    	StringBuilder prefix = new StringBuilder();
    	for(int c=0; c< l1; c++)
    		if(strs[m1].charAt(c)==strs[m2].charAt(c)) prefix.append(strs[m1].charAt(c));
    		else break;
    	do{
    		for(int c=0; c<strs.length; c++)
    			if (!strs[c].startsWith(prefix.toString())) {
    				prefix.deleteCharAt(prefix.length()-1);
    				break;
    			}
    		break;
    	}while(prefix.length()!=0);
    	return prefix.toString();
    }
    public static int findPos(int[] nums){
    	//a question maybe from 2017 JinRiTouTiao
    	int[] signs = new int[nums.length+1];
    	for(int c=0; c<signs.length; c++){
    		signs[c] = ( (c < nums.length) ? nums[c] : (nums.length+1) ) - ( (c-1 < 0) ? 0 : nums[c-1] );
    		signs[c] = signs[c] / Math.abs(signs[c]);
    	}
    	//phase 1
    	if (Arrays.stream(signs).sum()==nums.length-1)
    		for(int c=0; c<signs.length; c++)
    			if(signs[c]<0) 	return c-1;
    	//phase 2
    	signs[0] *= -1;
    	signs[signs.length-1] *= -1;
    	if (Arrays.stream(signs).sum()==-nums.length+1)    	
    		for(int c=0; c<signs.length; c++)
    			if(signs[c]>0) 	return c;   	
    	return -1;
    }
    public static int reverseOrderNum(String str){
    	//A question from 2017 tencent test
    	HashMap<Character,Integer > existNum = new HashMap<Character,Integer >();
    	for(char c1 = 'D'; c1 > 'A'; c1--)
    		existNum.put(c1, 0);
    	int count = 0;
    	for(int c=0; c < str.length(); c++){
    		char ch = str.charAt(c);
    		for(ch++; ch <= 'D'; ch++)
    			count += existNum.get(ch);
    		if (existNum.get(str.charAt(c)) != null)
    			existNum.put(str.charAt(c), existNum.get(str.charAt(c))+1);
    	}
    	return count;
    }
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        Queue<TreeNode> qu = new LinkedList<TreeNode>();
        qu.add(root);
        while(!qu.isEmpty()){
        	list.add(0, new LinkedList<Integer>()); 	//add at the first pos
        	int size = qu.size();
        	for(int c=0; c<size; c++){
        		TreeNode now  = qu.remove();
        		if(now.left != null)
        			qu.add(now.left);
        		if(now.right != null)
        			qu.add(now.right);
        		list.get(0).add(now.val);
        	}
        }
        return list;
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
        	return null;
        else{
        	TreeNode root = new TreeNode(0);
        	sortedArrayToBSTAux(nums, 0, nums.length-1, root);
        	return root;
        }	
    }
    private static void sortedArrayToBSTAux(int[] nums, int p, int q, TreeNode root){
    	if (p<=q){
    		int mid = (p+q)/2;
    		root.val = nums[mid];
    		if (p <= mid-1){
    			root.left = new TreeNode(0);
    			sortedArrayToBSTAux(nums, p, mid-1, root.left);
    		}
    		if (mid+1 <= q) {
    			root.right = new TreeNode(0);
    			sortedArrayToBSTAux(nums, mid+1, q, root.right);
    		}
    	}
    }
    public static boolean isBalanced(TreeNode root) {
    	if (isBalancedAux(root)>0)
    		return true;
    	else
    		return false;
    }
    private static int isBalancedAux(TreeNode root) {
    	if (root==null) return 0;
    	int h1 = isBalancedAux(root.left);
    	if (h1<0) return -1;
    	int h2 = isBalancedAux(root.right);
    	if (h2<0) return -1;
    	if (Math.abs(h1-h2) <=1 )
    		return Math.max(h1, h2)+1;
    	else
    		return -1;
    }
    public static List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> tri = new LinkedList<List<Integer>>();
    	if(numRows <= 0) return tri;
    	tri.add(new LinkedList<Integer>(){{super.add(1);}});
    	if(numRows == 1) return tri;
    	tri.add(new LinkedList<Integer>(){{super.add(1); super.add(1);}});
    	if(numRows == 2) return tri;
    	List<Integer> line, lastLine ;
    	for(int nRows=3; nRows<= numRows; nRows++) {
    		line = new LinkedList<Integer>();
    		lastLine = tri.get(tri.size()-1);
    		line.add(1);
    		for(int c=1; c<= nRows-2; c++)
    			line.add(lastLine.get(c-1)+lastLine.get(c));
    		line.add(1);
    		tri.add(line);
    	}
    	return tri;
    }
    public static int maxProfit(int[] prices){
    	if (prices.length<1) return 0;
    	int buy=prices[0], sell=prices[0],  mProfit = 0;
    	for(int c=1; c<prices.length; c++){
    		if (prices[c] < buy){
    			buy = prices[c];
    			sell = prices[c];
    		}
    		else if(prices[c] > sell)
    			sell = prices[c];
    		mProfit = Math.max(sell-buy, mProfit);
    	}
    	return mProfit;
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>(rowIndex+1);
        row.add(1);
        if (rowIndex==0) return row;
        row.add(1);
        for(int l=3; l<=rowIndex+1; l++){
        	int last = row.get(0).intValue();
        	for(int c=1; c<l-1; c++){
        		int current = last + row.get(c).intValue();
        		last = row.get(c).intValue();
        		row.set(c, current);

        	}
        	row.add(1);
        }
        return row;
    }
    public static int maxProfit2(int[] prices) {
    	if (prices.length <= 1) return 0;
    	int slope = -1, buy = -1, sumProfit = 0;
        for(int c=1; c<prices.length; c++){
        	if (prices[c] - prices[c-1] >= 0){
        		if (slope == -1)
        			buy = c-1;
    			slope = 1;
        	} else {
        		if (slope == 1)
        			sumProfit += prices[c-1] - prices[buy];
        		slope = -1;
        		buy = c;
        	}
        }
        sumProfit += buy==-1 ? 0 :  prices[prices.length-1] - prices[buy] ;
        return sumProfit;
    }
    public static boolean isPalindrome(String s) {
        int p=0, q=s.length()-1;
        while(p<q){
        	if ( !Character.isLetterOrDigit(s.charAt(p)) ) { p++; continue; }
        	if ( !Character.isLetterOrDigit(s.charAt(q)) ) { q--; continue; }
        	if ( Character.toLowerCase(s.charAt(p)) != Character.toLowerCase(s.charAt(q)) ) return false;
        	p++; q--;
        }	
        return true;
    }
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int c=0; c<nums.length; c++) 
        	if(!m.containsKey(nums[c])) m.put(nums[c], 1);
        	else m.put(nums[c], 2);
        Iterator<Integer> i = m.keySet().iterator(); 
        while(i.hasNext()){
        	Integer key = i.next();
        	if (m.get(key)==1) return key;
        }
        return -1;      
    }
    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode l1 = head, l2 = head.next;
        while(l1 != l2){
            if (l1==null) return false;
            else l1 = l1.next;
            if (l2==null) return false;
            else l2 = l2.next;
            if (l2==null) return false;
            else l2 = l2.next;
        }
        return true;
    }
    public static int[] twoSum2 (int[] numbers, int target) {
    	int[] indeces = null;
    	Map<Integer, Integer> m = new HashMap<Integer, Integer>();
    	for(int c=0; c<numbers.length; c++) {
    		if ( m.containsKey(numbers[c]) ) { 
    			indeces = new int[2];
    			indeces[0] = m.get(numbers[c]); 
    			indeces[1] = c+1; 
    			return indeces; 
    		}
    		m.put(target- numbers[c], c+1);	
    	}
    	if (indeces == null) throw new IllegalArgumentException("No two sum solution");
    	return indeces;
    }
    public static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while(n!=0){
        	sb.append((char)('A' + --n%26) );
        	n /= 26;
        }
        return sb.reverse().toString();
    }
    public static int titleToNumber(String s) {
        int res = 0;
        for(int c=0; c<s.length(); c++){
        	res *= 26;
        	res += s.charAt(c) - '@'; 
        }
        return res;
    }
    public static int trailingZeroes(int n) {
    	return Math.min( trailingZeroesAux(n, 2), trailingZeroesAux(n, 5) );
    }
    private static int trailingZeroesAux(int n, int m) {
    	if (n/m == 0 ) return 0;
    	else return n/m + trailingZeroesAux(n/m , m);
    }
    public static int majorityElement( int nums[] ) {
    	//It is a wrong answer!!!
    	/*    	
    	* long sum = 0;
    	* for(int c=0; c < nums.length; c++) sum += nums[c];
    	* long delta = Integer.MAX_VALUE;
    	* int n = -1;
    	* for(int c=0; c < nums.length; c++)
    	*		if ( Math.abs(sum - nums[c] * nums.length) < delta) { delta = Math.abs(sum - nums[c] * nums.length); n = c;}
    	* return nums[n];
    	 */
    	Arrays.sort(nums);
    	return(nums[nums.length >> 1]);
    }
    public static void rotate(int[] nums, int k) {
    	k %= nums.length;
//        for(int c=1; c <= k; c++){
//        	int top = nums[nums.length-1];
//        	for(int c1=nums.length-1; c1 > 0; c1--)
//        		nums[c1] = nums[c1-1];
//        	nums[0] = top;
//        }
//        int[] tmp = new int[nums.length];
//        for(int c = 0; c < nums.length; c++)
//        	tmp[(c+k) % nums.length] = nums[c];
//        for(int c = 0; c < nums.length; c++)
//        	nums[c] = tmp[c];
        int[] tail = new int[k];
        for(int c=0; c < k; c++)
        	tail[c] = nums[nums.length-k+c];
        for(int c=nums.length-1; c >= k ; c--)
        	nums[c] = nums[c-k];
        for(int c=0; c < k; c++)
        	nums[c] = tail[c];
    }
    public static int reverseBits(int n) {
    // you need treat n as an unsigned value
    	int re = 0;
    	for(int c=0; c < 32; c++)
    		if ( ( n & (1 << (31-c)) ) != 0)
    			re |= 1<<c;
    	return re;
    }
    public static int hammingWeight(int n) {
        int cnt = 0;
    	while(n != 0){
    		n &= n-1;
    		cnt++;
    	}
    	return cnt;
    }
    public static int mySqrt2(int x) {
        if (x==0) return 0;
    	else if (x < 4) return 1;
    	else {
    		int p = 1, q = x/2 +1;
    		while (p<q){
    			int mid = (p+q)/2;
    			if ( x / mid == mid ) 
    			    return mid;
    			else if (x / mid < mid ) // not always (float) x / mid < mid
    			    q = mid - 1;
    			else  					// (float) x / mid > mid 
    			    p = mid + 1;
    		}	
    		if(x / p >= p) return p;
    		else return p-1;
    	}	      
    }
    public static int rob(int[] nums) {
        if(nums.length < 1) return 0;
        if(nums.length == 1) return nums[0];
        int maxOO = 0, maxXO = nums[0], maxOX = nums[1];
        int maxVal = Math.max(maxOO, Math.max(maxXO, maxOX));
        for(int c=2; c < nums.length; c++){
        	int tmpXO = maxOX;
        	int tmpOO = Math.max(maxXO, maxOO);
        	int tmpOX = Math.max(maxOO + nums[c], maxXO + nums[c]);
        	maxXO = tmpXO; maxOO = tmpOO; maxOX = tmpOX;
        	maxVal = Math.max(maxOO, Math.max(maxXO, maxOX));
        }
        return maxVal;
    }
    public static boolean isHappy(int n) {
    // This is a wrong answer. It can not detect cycle.
        if (n == 1) 
        	return true ;
        else {
        	int sum = 0;
        	do{
        		sum += (n % 10) * (n % 10);
        		n /= 10;
        	}while( n != 0);
        	return isHappy(sum);
        }
    }
    public static ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val) head = head.next;
        ListNode last = head, now = head;
        while(last != null){
            now = last.next;
        	while(now != null && now.val == val) now = now.next;
        	last.next = now;
        	last = now;
        }
        return head;        
    }
    public static boolean isIsomorphic(String s, String t) {
    	if (s.length() != t.length()) return false;
        Map<Character, Character> m = new HashMap<Character, Character>();
        for(int c=0; c < s.length(); c++){
        	if (m.containsKey(s.charAt(c))){
        		if ( t.charAt(c) != m.get(s.charAt(c)) ) return false; 
        	} else
        		m.put(s.charAt(c), t.charAt(c));
        }
        m.clear();
        for(int c=0; c < s.length(); c++){
        	if (m.containsKey(t.charAt(c))){
        		if ( s.charAt(c) != m.get(t.charAt(c)) ) return false; 
        	} else
        		m.put(t.charAt(c), s.charAt(c));
        }        
        return true;
    }
    public static ListNode reverseList(ListNode head) {
    	if (head == null) return null;
        ListNode done = head, now = head.next, undone = null;
        done.next = null;
        while(now != null){
        	undone = now.next;
        	now.next = done;
        	done = now;
        	now = undone;
        }
        return done;
    }
    public static boolean containsDuplicate(int[] nums) {
    //Time limited exceeded if using HashSet
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int c=0; c < nums.length; c++)
        	if(m.containsKey(nums[c])) return true;
        	else m.put(nums[c],c);
        return false; 
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int c=0; c < nums.length; c++){
        	Integer idx = m.get(nums[c]);
            	if(idx != null && c - idx <= k) 
            		return true;
            	m.put(nums[c], c);
         }
         return false;
    }
    public static TreeNode invertTree(TreeNode root) {
    	if (root == null) return null;
    	TreeNode t = root.left;
    	root.left = root.right;
    	root.right = t;
    	invertTree(root.left);
    	invertTree(root.right);
    	return root;
    }
    public static boolean isPowerOfTwo(int n) {
        return  ( n & (n-1) ) == 0 ? true : false;
    }
    public static boolean isPalindrome(ListNode head) {
        int length = 0;
        ListNode p = head;
        while(p != null) {
        	length++;
        	p = p.next;
        }
        if ( length <=1 ) return true;
        ListNode left = head, right = null, middle = head;
        for(int c=0; c < length/2 -1; c++) middle = middle.next;
        if (length % 2 != 0) middle = middle.next;
        right = middle.next;
        middle.next = null;
        right = reverseList(right);
        boolean flag = true;
        ListNode pl = left, pr = right;
        while(pl != null && pr != null) {
        	if (pl.val != pr.val) {
        		flag = false;
        		break;
        	}
        	pl = pl.next;
        	pr = pr.next;
        }
        right = reverseList(right);
        middle.next = right;
        return flag;
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	int min = p.val, max = q.val;
    	if( p.val > q.val ) {
    		min = q.val;
    		max = p.val;
    	}
    	while( root != null ){
    		if (max < root.val) root = root.left;
    		else if (min > root.val) root = root.right;
    		else break;
    	}
    	return root;
    }
    public static void deleteNode(ListNode node) {
    	ListNode last = null;
    	while(node.next != null){
    		node.val = node.next.val;
    		last = node;
    		node = node.next;
    	}
    	last.next = null;
    }
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> count = new HashMap<Character, Integer>();
        for(int i=0; i < s.length(); i++){
        	Integer v = count.get(s.charAt(i));
        	if(v == null) count.put(s.charAt(i), 1);
        	else count.put(s.charAt(i), v+1);
        }
        for(int i=0; i < t.length(); i++){
        	Integer v = count.get(t.charAt(i));
        	if(v == null) return false;
        	else if(v == 1) count.remove(t.charAt(i));
        	else count.put(t.charAt(i), v-1);
        }
        if(count.isEmpty()) return true;
        else return false;
    }
    public static List<String> binaryTreePaths(TreeNode root) {
    	List<String> oldPathL = null, oldPathR = null, paths = new LinkedList<String>();
    	if(root == null)
    		return paths;
        else if(root.left == null && root.right == null) {
        	paths.add(Integer.toString(root.val));
        	return paths;
        }else{
        	oldPathL = binaryTreePaths(root.left);
        	oldPathR = binaryTreePaths(root.right);
        }
        if(oldPathL != null)
            for(String s : oldPathL) paths.add(Integer.toString(root.val) + "->" + s);
        if(oldPathR != null)
            for(String s : oldPathR) paths.add(Integer.toString(root.val) + "->" + s);
        return paths;        
    }
    public static int addDigits(int num) {
    	int sum = 0, now = 0;
        while(num != 0){
        	now = num % 10;
        	sum += now;
        	num /= 10;
        	if( sum >= 10 ) sum = sum%10 +1;
        }
        return sum;
    }
    public static boolean isUgly(int num) {
        if (num==0) return false;
        while(num != 1){
        	if (num%2 == 0)
        		num /= 2;
        	else if (num%3 == 0)
        		num /= 3;
        	else if (num%5 == 0)
        		num /= 5;
        	else
        		return false;
        }
        return true;
    }
    public static int missingNumber(int[] nums) {
    	int n = nums.length, diff = 0;
    	for(int c=0; c<n; c++){
    		diff += c+1;
    		diff -= nums[c];
    	}
    	return diff;
    }
    private static boolean isBadVersion(int i){
    	return isBadVersionList[i-1]==0;
    }
    public static int firstBadVersion(int n) {
        if (isBadVersion(1)) return 1;
        int p = 1, q = n, mid = p+(q-p)/2;
        while( q-p > 1 ){
            mid = p+(q-p)/2;
            if(isBadVersion(mid)) q = mid;
            else p = mid;
        }
        return q;
    }
    public static void moveZeroes(int[] nums) {
    	moveZerosAux(nums, 0, nums.length-1);
    }
    private static int moveZerosAux(int[] nums, int start, int end){ //end included
    	if (start >= end) {
    			if(nums[start]==0) return start;
    			else return end+1;
    	}
    	int posL = moveZerosAux(nums, start, start + (end-start)/2);
    	int posR = moveZerosAux(nums, start + (end-start)/2 + 1, end);
    	int lengthL = start + (end-start)/2 - posL + 1; 
    	if (lengthL == 0) return posR;
    	for(; posL + lengthL < posR; posL++)
    		nums[posL] = nums[posL+lengthL];
    	for(; posL < posR; posL++) nums[posL] = 0;
    	return posR - lengthL;	
    }
    public static boolean wordPattern(String pattern, String str) {
        String[] mappingL = new String[26];
        Map<String, Character> mappingR = new HashMap<String, Character>();
        int p = 0, sf = 0, sr = 0;
        while(sf < str.length()){
        	while(sf < str.length() && !Character.isAlphabetic(str.charAt(sf))) sf++;
        	sr = sf;
        	while(sr < str.length() && Character.isAlphabetic(str.charAt(sr))) sr++;
        	if(p >= pattern.length()) {
        		p=-1;
        		break;
        	}
        	char lp = Character.toLowerCase(pattern.charAt(p));
        	String sub = str.substring(sf, sr);
        	if(mappingL[lp - 'a'] == null)
        		mappingL[lp - 'a'] = sub;
        	else if(mappingL[lp - 'a'].equals(sub)) ;
        	else break;
        	if(!mappingR.containsKey(sub))
        		mappingR.put(sub, lp);
        	else if(mappingR.get(sub) == lp) ;
        	else break;
    		p++;
    		sf = sr;
        }
        if(sf>=str.length() && p >= pattern.length()) return true;
        else return false;
    }
    public static boolean canWinNim(int n) {
    	//Not a best solution
        boolean winner[][] = new boolean[3][3]; //T for first person A, F for the second B
        // winner[i][j] means the winner if A takes j+1 when i+1 coins
        winner[0][0] = true; winner[0][1] = true; winner[0][2] = true;
        winner[1][0] = false; winner[1][1] = true; winner[1][2] = true;
        winner[2][0] = false; winner[2][1] = false; winner[2][2] = true;
        for(int i=3; i<n; i++)
        	for(int j=2; j>=0; j--)
        		winner[i%3][j] = !winner[(i-j-1)%3][0] && !winner[(i-j-1)%3][1] && !winner[(i-j-1)%3][2];
        return winner[(n-1)%3][0] || winner[(n-1)%3][1] || winner[(n-1)%3][2];
    }
    public static int countPrimes(int n) {
    /*	
    	//time limit exceeded
        LinkedList<Integer> primes = new LinkedList<Integer>();
        boolean isPrime;
        for(int c=2; c<n; c++){
        	isPrime = true;
        	for(int p=0; p < primes.size(); p++) 
        		if( c%primes.get(p) == 0 ) {
        			isPrime = false;
        			break;
        		}
        	if(isPrime) primes.add(c);
        }
        return primes.size();
    */
    	if( n<=2 ) return 0;
    	boolean[] notPrime = new boolean[n];
    	int sum = 0;
    	for(int c=2; c<n; c++){
    		if(notPrime[c]) continue;
    		else sum++;
    		for(int i = 2; i <= n/c; i++  ) 
    			if(c*i < n) notPrime[c*i] = true;
    	}
    	return sum;
    }
}
class MyTree{
	public static TreeNode root = null;
	public static void buildTree(Integer[] nums){
		//transform a List to a Tree
		assert root == null;
		assert nums.length >=1 ;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		Queue<Integer> q2 = new LinkedList<Integer>();
		root = new TreeNode(nums[0]);
		q.add(root);
		q2.add(0);
		q2.add(1);
		for(int c=1; c<nums.length; c++){
			Integer i = nums[c];
			TreeNode now = null;
			if (q2.remove()==0) {
				now = q.element();
				if(i!=null) {
					now.left = new TreeNode(i);
					q.add(now.left);
					q2.add(0);
					q2.add(1);
				}
			}else{
				now = q.remove();
				if(i!=null) {
					now.right = new TreeNode(i);
					q.add(now.right);
					q2.add(0);
					q2.add(1);
				}
			}
		}
	}
	public static void printTreeDLR(){
		Stack<TreeNode> s = new Stack<TreeNode>();
		StringBuilder str = new StringBuilder();
		s.push(root);
		while(!s.empty()){
			TreeNode now = s.pop();
			if (now!=null) {
				str.append(now.val+" ");
				s.push(now.right);
				s.push(now.left);
			}
		}
		System.out.println(str.toString());
	}
	public static void printTreeLRD(){
		Stack<TreeNode> s = new Stack<TreeNode>();
		StringBuilder str = new StringBuilder();
		TreeNode now = root;
		TreeNode last = root;
		s.push(now);
		while(true){
			while(now.left != null && now.left != last && now.right != last){
				now = now.left;
				s.push(now);
			}
			if(now.right!=null && now.right!=last) {
				now = now.right;
				s.push(now);
			}else{
				str.append(now.val+" ");
				last = now;
				s.pop();
				if(s.empty()) break;
				else {
					now = s.pop();
					s.push(now);
				}
			}
		}
		System.out.println(str.toString()+" ");
	}
}
//Definition for a binary tree node.
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
class MyLinkedList {
	private  MyLinkedList(){
		;
	}
	public static void buildLinkedList(int[] nums){
		if (head != null) return;
		head = new ListNode(0);
		ListNode now = head;
		for(int c=0; c < nums.length; c++){				
			now.next = new ListNode(nums[c]);
			now = now.next;
		}
	}
	public static void buildLinkedList(int[] nums, int rollBack ){
		// build a circled linked list
		buildLinkedList(nums);
		int lth = 0;
		ListNode p = head, q = head;
		while(p.next!=null) { p=p.next; lth++;}
		assert rollBack + 1 <= lth;
		for(int c=0; c<=rollBack; c++) q = q.next;
		p.next = q;
	}
	public static void printLinkedList(){
		List<Integer> lst = new LinkedList<Integer>();
		ListNode now = head;
		now = now.next;
		while(now!=null){
			lst.add(now.val);
			now = now.next;
		}
		System.out.println(lst);
	}
	public static ListNode head = null;
}
//Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}
// initialize your data structure here. 
class MinStack {
	public MinStack() {
		 nums = new LinkedList<Integer>();
		 mins = new LinkedList<Integer>();
		 mins.add(Integer.MAX_VALUE);
	}

	public void push(int x) {
		nums.add(x);
		if (x<mins.get(mins.size()-1)) mins.add(x);
		else mins.add(mins.get(mins.size()-1));
	}

	public void pop() {
		nums.remove(nums.size()-1);
		mins.remove(mins.size()-1);
		
	}

	public int top() {
		return nums.get(nums.size()-1);
	}

	public int getMin() {
		return mins.get(mins.size()-1);
	}
	private List<Integer> nums;
	private List<Integer> mins;
}
class MyStack {

    /** Initialize your data structure here. */
	private Queue<Integer> front;
	private Queue<Integer> rear;
    public MyStack() {
    	front = new LinkedList<Integer>();
    	rear = new LinkedList<Integer>();    
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	front.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        Integer top = null;
        while(true){
        	top = front.poll();
        	if (front.isEmpty()) break;
        	else rear.add(top);
        }
        Queue<Integer> temp = front;
        front = rear;
        rear = temp;
        return top;
    }
    
    /** Get the top element. */
    public int top() {
        Integer top = null;
        while(!front.isEmpty()){
        	top = front.poll();
        	rear.add(top);
        }
        Queue<Integer> temp = front;
        front = rear;
        rear = temp;
        return top;        
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return front.isEmpty();
    }
}
class MyQueue {
	private Stack<Integer> s;
	private Stack<Integer> extra;
    /** Initialize your data structure here. */
    public MyQueue() {
    	s = new Stack<Integer>();
    	extra = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        while(!s.isEmpty())
        	extra.push(s.pop());
        s.push(x);
        while(!extra.isEmpty())
        	s.push(extra.pop());
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return s.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return s.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s.isEmpty();
    }
}
