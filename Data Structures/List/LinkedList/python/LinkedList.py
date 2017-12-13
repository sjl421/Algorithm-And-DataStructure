import Node;
class LinkedList:
    def __index__(self):
        self.head = None

    def getCount(self):
        temp = self.head
        count = 0
        while (temp):
            count += 1
            temp = temp.next
        return count

if __name__ == '__main__':
    list=LinkedList()
    list.head=Node(1)
    second=Node(2)
    third=Node(3)
    list.head.next=second
    second.next=third
    print third.data