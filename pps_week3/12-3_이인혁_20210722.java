package week3;

//12-3
/*
class KthLargest {

    PriorityQueue<Integer> pq;
    int k;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        this.k = k;
        for (int num: nums) {
            pq.offer(num);
            if (pq.size() > k) { pq.poll(); }
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        if (pq.size() > k) { pq.poll(); }
        return pq.peek();
    }
}

*/