import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Solution {
    Random random;
    Map<Integer, ListNode> map;
    int n;

    public Solution(ListNode head) {
        random = new Random();
        map = new HashMap<>();
        int i = 0;
        while (head != null) {
            map.put(i, head);
            i++;
            head = head.next;
        }
        n = i;

    }

    public int getRandom() {
        return map.get(random.nextInt(n)).val;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}