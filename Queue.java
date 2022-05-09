package assignment.com;
	import java.util.ArrayList;
	public  class Queue{
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		void add(int x) {
			arr.add(x);
		}
		void pop() {
			arr.remove(arr.size()-1);

		}
		void peek(){
			System.out.println(arr.get(0));
			
		}
		void printer() {
			for (int i: arr) {
				System.out.print(i+" ");
				
			}
			System.out.println("queue is printed");
		}
		void delete() {
			arr.clear();
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Queue q=new Queue();
			q.add(10);
			q.add(27);
			q.add(38);
			q.add(47);
			q.printer();
			q.pop();
			q.peek();
			q.printer();
			q.delete();
			q.printer();
	            
		}

	}