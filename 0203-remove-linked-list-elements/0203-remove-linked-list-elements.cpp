class Solution {
public:
    ListNode* removeElements(ListNode* head, int val) {

        // Part 1: Remove matching nodes from the beginning
        while (head != nullptr && head->val == val) {
            ListNode* del = head;
            head = head->next;
            delete del;
        }

        // Part 2: Remove matching nodes from the remaining list
        ListNode* temp = head;

        while (temp != nullptr && temp->next != nullptr) {
            if (temp->next->val == val) {
                ListNode* del = temp->next;
                temp->next = del->next;
                delete del;
            } else {
                temp = temp->next;
            }
        }

        return head;
    }
};