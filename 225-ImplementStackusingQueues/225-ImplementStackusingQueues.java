// Last updated: 02/09/2026, 14:20:00
1public class MyStack {
2    private Queue<Integer> q;
3
4    public MyStack() {
5        q = new LinkedList<>();
6    }
7
8    public void push(int x) {
9        q.add(x);
10        for (int i = 1; i < q.size(); i++) {
11            q.add(q.remove());
12        }
13    }
14
15    public int pop() {
16        return q.remove();
17    }
18
19    public int top() {
20        return q.peek();
21    }
22
23    public boolean empty() {
24        return q.isEmpty();
25    }
26}