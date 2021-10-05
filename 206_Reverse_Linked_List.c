/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* reverseList(struct ListNode* head){
    struct ListNode *prev,*current;
    if(head==NULL)
        return head;
    if(head!=NULL)
    {
        prev=head;
        head=head->next;
        current=head;
        prev->next=NULL;
        while(head!=NULL)
        {
            head=head->next;
            current->next=prev;
            prev=current;
            current=head;
        }
        head=prev;
    }return head;
}
