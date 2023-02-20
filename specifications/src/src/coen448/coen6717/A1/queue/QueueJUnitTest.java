package coen448.coen6717.A1.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



class QueueJUnitTest {
	
	private ADTQueue<Integer> Q1;
	private ADTQueue<Integer> Q2;
	
	

	@BeforeEach
	void setUp() throws Exception {
		
		Q1 = new DQueue<Integer>();
		Q2 = new DQueue<Integer>();
		
		
	}

	@Test
	public void testGeneral() {
		int temp;
		
		Q2.enqueue(10);
		Q2.enqueue(20);
		Q2.enqueue(15);
		assertEquals("< 10 20 15 >", Q2.toString());
		
		while(Q2.length() > 0) {
		  temp = Q2.dequeue();
		  Q1.enqueue(temp);
		}
		assertEquals("< >", Q2.toString());
		assertEquals("< 10 20 15 >", Q1.toString());

	}
	@Test
	public void testCase1(){
		/*Tester's name: Savvas Sideris
		* Date: 2023/02/19
		* Test input Data: <A 10 20 30 40 50>.
		* TestType: interface, black box
		* Description: Aqeueue execute the enqueue function and examine if the dataset is full
		* Expected output: "< 10 20 30 40 50 >"
		* Bug report: NA
		* */
		Q1 = new AQueue<>(6);
		Q1.enqueue(10);
		Q1.enqueue(20);
		Q1.enqueue(30);
		Q1.enqueue(40);
		Q1.enqueue(50);

		assertEquals("< 10 20 30 40 50 >", Q1.toString());
	}

	@Test
	public void testCase2(){
		/*Tester's name: Keeano Gerald
		 * Date: 2023/02/19
		 * Test input Data: < >.
		 * TestType: interface, black box
		 * Description: Aqueue execute the frontValue function and examine if the dataset is empty
		 * Expected output: "< >"
		 * Bug report: NA
		 * */
		Q1 = new AQueue<>(1);
		assertEquals("< >", Q1.toString());
	}
	@Test
	public void testCase3(){
		/*Tester's name: Savvas Sideris
		 * Date: 2023/02/19
		 * Test input Data: < >.
		 * TestType: interface, black box
		 * Description: Aqueue check if insert is empty
		 * Expected output: "< null >"
		 * Bug report: NA
		 * */
		Q1 = new AQueue<>(2);
		Q1.enqueue(null);
		assertEquals("< null >", Q1.toString());
	}
	@Test
	public void testCase4(){
		/*Tester's name: Keeano Gerald
		 * Date: 2023/02/19
		 * Test input Data: < 10 >.
		 * TestType: interface, black box
		 * Description: Aqueue check if insert is empty
		 * Expected output: "< 10 >"
		 * Bug report: NA
		 * */
		Q1 = new AQueue<>(2);
		Q1.enqueue(10);
		assertEquals("< 10 >", Q1.toString());
	}

	@Test
	public void testCase5(){
		/*Tester's name: Keeano Gerald
		 * Date: 2023/02/19
		 * Test input Data: 0.
		 * TestType: functionality, black box
		 * Description: Aqueue check the size of the array of 0
		 * Expected output: "0"
		 * Bug report: NA
		 * */
		Q1 = new AQueue<>(1);
		String testoutput = Integer.toString(Q1.length());
		assertEquals("0", testoutput);
	}
	@Test
	public void testCase6(){
		/*Tester's name: Savvas Sideris
		 * Date: 2023/02/19
		 * Test input Data: 1.
		 * TestType: functionality, black box
		 * Description: Aqueue check the size of the array of 1
		 * Expected output: "1"
		 * Bug report: NA
		 * */
		Q1 = new AQueue<>(1);
		Q1.enqueue(10);
		String testoutput = Integer.toString(Q1.length());
		assertEquals("1", testoutput);
	}
	@Test
	public void testCase7(){
		/*Tester's name: Savvas Sideris
		 * Date: 2023/02/19
		 * Test input Data: >1.
		 * TestType: functionality, black box
		 * Description: Aqueue check the size of the array of greater than 1
		 * Expected output: "2"
		 * Bug report: NA
		 * */
		Q1 = new AQueue<>(2);
		Q1.enqueue(10);
		Q1.enqueue(20);
		String testoutput = Integer.toString(Q1.length());
		assertEquals("2", testoutput);
	}

	@Test
	public void testCase8(){
		/*Tester's name: Keeano Gerald
		 * Date: 2023/02/19
		 * Test input Data: < 10 20 >
		 * TestType: interface, black box
		 * Description: Aqueue dequeue check to see if the element was removed
		 * Expected output: < 10 >
		 * Bug report: NA
		 * */
		Q1 = new AQueue<>(2);
		Q1.enqueue(10);
		Q1.enqueue(20);
		String testoutput = Integer.toString(Q1.dequeue());
		assertEquals("10", testoutput);
	}


//	//TODO
//	@Test
//	public void testCase9(){
//		/*Tester's name: Keeano Gerald
//		 * Date: 2023/02/19
//		 * Test input Data: < 10 20 >
//		 * TestType: interface, black box
//		 * Description: Aqueue dequeue check to see if the element was removed
//		 * Expected output: < 10 >
//		 * Bug report: NA
//		 * */
//		Q1 = new AQueue<>(2);
//		Q1.enqueue(null);
//		String testoutput = Integer.toString(Q1.dequeue());
//		//assertEquals("null", testoutput);
//	}

	@Test
	public void testCase10(){
		/*Tester's name: Savvas Sideris
		 * Date: 2023/02/19
		 * Test input Data: < 10 20 30>
		 * TestType: interface, black box
		 * Description: Lqueue enqueue check to see if it's full
		 * Expected output: < 10 >
		 * Bug report: NA
		 * */
		Q1 = new LQueue<>(3);
		Q1.enqueue(10);
		Q1.enqueue(20);
		Q1.enqueue(30);
		assertEquals("< 10 20 30 >", Q1.toString());
	}

	@Test
	public void testCase11(){
		/*Tester's name: Keeano Gerald
		 * Date: 2023/02/19
		 * Test input Data: < >.
		 * TestType: interface, black box
		 * Description: Lqueue enqueue execute the frontValue function and examine if the dataset is empty
		 * Expected output: "< >"
		 * Bug report: NA
		 * */
		Q1 = new LQueue<>(1);
		assertEquals("< >", Q1.toString());
	}
	@Test
	public void testCase13(){
		/*Tester's name: Savvas Sideris
		 * Date: 2023/02/19
		 * Test input Data: < >.
		 * TestType: interface, black box
		 * Description: Lqueue enqueue check if insert is empty
		 * Expected output: "< null >"
		 * Bug report: NA
		 * */
		Q1 = new LQueue<>(2);
		Q1.enqueue(null);
		assertEquals("< null >", Q1.toString());
	}
	@Test
	public void testCase14(){
		/*Tester's name: Keeano Gerald
		 * Date: 2023/02/19
		 * Test input Data: < 10 >.
		 * TestType: interface, black box
		 * Description: Lqueue enqueue check if insert is empty
		 * Expected output: "< 10 >"
		 * Bug report: NA
		 * */
		Q1 = new LQueue<>(2);
		Q1.enqueue(10);
		assertEquals("< 10 >", Q1.toString());
	}

	@Test
	public void testCase15(){
		/*Tester's name: Keeano Gerald
		 * Date: 2023/02/19
		 * Test input Data: 0.
		 * TestType: functionality, black box
		 * Description: Lqueue enqueue check the size of the array of 0
		 * Expected output: "0"
		 * Bug report: NA
		 * */
		Q1 = new LQueue<>(1);
		String testoutput = Integer.toString(Q1.length());
		assertEquals("0", testoutput);
	}
	@Test
	public void testCase16(){
		/*Tester's name: Savvas Sideris
		 * Date: 2023/02/19
		 * Test input Data: 1.
		 * TestType: functionality, black box
		 * Description: Lqueue enqueue check the size of the array of 1
		 * Expected output: "1"
		 * Bug report: NA
		 * */
		Q1 = new AQueue<>(1);
		Q1.enqueue(10);
		String testoutput = Integer.toString(Q1.length());
		assertEquals("1", testoutput);
	}
	@Test
	public void testCase17(){
		/*Tester's name: Savvas Sideris
		 * Date: 2023/02/19
		 * Test input Data: >1.
		 * TestType: functionality, black box
		 * Description: Lqueue enqueue check the size of the array of greater than 1
		 * Expected output: "2"
		 * Bug report: NA
		 * */
		Q1 = new LQueue<>(2);
		Q1.enqueue(10);
		Q1.enqueue(20);
		String testoutput = Integer.toString(Q1.length());
		assertEquals("2", testoutput);
	}

	@Test
	public void testCase18(){
		/*Tester's name: Keeano Gerald
		 * Date: 2023/02/19
		 * Test input Data: < 10 20 >
		 * TestType: interface, black box
		 * Description: Lqueue dequeue check to see if the element was removed
		 * Expected output: < 10 >
		 * Bug report: NA
		 * */
		Q1 = new LQueue<>(2);
		Q1.enqueue(10);
		Q1.enqueue(20);
		String testoutput = Integer.toString(Q1.dequeue());
		assertEquals("10", testoutput);
	}

	@Test
	public void testCase19(){
		/*Tester's name: Savvas Sideris
		 * Date: 2023/02/19
		 * Test input Data: < 10 20 30 40 50>.
		 * TestType: interface, black box
		 * Description: Dqeueue enqueue execute the enqueue function and examine if the displays the right number of variables
		 * Expected output: "5"
		 * Bug report: NA
		 * */
		Q1 = new DQueue<>();
		Q1.enqueue(10);
		Q1.enqueue(20);
		Q1.enqueue(30);
		Q1.enqueue(40);
		Q1.enqueue(50);
		String testoutput = Integer.toString(Q1.length());
		assertEquals("5", testoutput);
	}

	@Test
	public void testCase20(){
		/*Tester's name: Savvas Sideris
		 * Date: 2023/02/19
		 * Test input Data: < 10 20 30 40 50>.
		 * TestType: interface, black box
		 * Description: Dqeueue dequeue execute the dequeue function and examine if the element is removed
		 * Expected output: "10"
		 * Bug report: NA
		 * */
		Q1 = new DQueue<>();
		Q1.enqueue(10);
		Q1.enqueue(20);
		Q1.enqueue(30);
		Q1.enqueue(40);
		Q1.enqueue(50);
		String testoutput = Integer.toString(Q1.dequeue());
		assertEquals("10", testoutput);
	}








}
