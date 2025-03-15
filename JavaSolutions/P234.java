class Solution {
    public boolean isPalindrome(ListNode head) {

        Stack<Integer> st = new Stack<>();
        ListNode trav = head;
        while(trav!=null){
            st.push(trav.val);
            trav = trav.next;
        }
        trav = head;

        while(!st.isEmpty()){
            if(trav.val != st.pop())
                return false;
            trav= trav.next;
        }            
        return true;
       
    }
}
