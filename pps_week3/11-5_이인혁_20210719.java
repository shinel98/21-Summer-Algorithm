package week3;

// 11-5
/*
class Solution {
    public int calPoints(String[] ops) {
        ArrayList<Integer> list = new ArrayList<>();
    	int index = -1;
    	int sum = 0;
    	int add = 0;
    	for(int i=0; i<ops.length; i++) {
    		if(ops[i].charAt(0) == 'D') {
    			list.add(list.get(index)*2);
    			index++;
    		}
    		else if(ops[i].charAt(0) == 'C') {
    			list.remove(list.get(index));
    			index--;
    		}
    		else if(ops[i].charAt(0) == '+') {
    			add = list.get(index) + list.get(index-1);
    			list.add(add);
    			index++;
    		}
    		else {
    			list.add(Integer.parseInt(ops[i]));
    			index++;
    		}
    	}
    	for(int i=0; i<=index; i++) {
    		sum += list.get(i);
    	}
    	return sum;
    }
}
*/