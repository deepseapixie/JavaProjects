# JavaProjects
A series of Java projects that I've decided to do.

# ChatRoom
An online retailer has a warehouse, where workers pick items from storage shelves to fulfill customer orders. The picked
items can later be packed and shipped to the customers. Each order could have a different number of items and different
categories of items. To save time, a worker can handle more than one order. How would you design a system to assign
workers to customer orders? For simplicity sake:

* Assume 2 categories of items (books and electronics), 5 initially available workers in this order: Alice, Bob, Carol,
David, Emily, and each order has at most 10 items.
* A worker can be assigned to more than one customer order (“bundling” the orders) if all items in the orders are in the
same category, but the total number of items does not exceed 10. The system should not read in the entire input file
before processing orders.
* If a worker has capacity to bundle, he/she should wait and bundle orders, but should not wait for more than 5 minutes.
* Only consecutive orders can be bundled; ie. older orders before newer ones.
* Assume each worker needs 1 minute to find and pick each item in the same category and an additional 5 minutes of
traveling time for each category.

To manage customer orders, available representatives, and worker assignments, I use Singly Linked Lists.

## Input

To simulate the customer orders, an input file contains the customer orders in the same directory as the program
file.

* CustomerOrder orderTime customer numberOfBooks numberOfElectronics
* PrintAvailableWorkerList printTime
* PrintWorkerAssignmentList printTime
* PrintMaxFulfillmentTime printTime

For simplicity, time is in HHMM format (HH: 00-23 and MM: 00-59), the leading zero is optional. Fulfillment Time is the
amount of time between when an order is made and when a worker finishes picking items for the order(s). MaxFulfillmentTime
is the longest Fulfillment Time among all the orders so far. AvailableWorkerList is in availability order. Ordering of
WorkerAssignmentList is not specified.

## Output

* CustomerOrder orderTime customer numOfBooks numOfElectronics
* WorkerAssignment worker assignmentTime customer1 customer2 ...
* OrderCompletion customer orderCompletionTime
* AvailableWorkerList worker1 worker2 ...
* WorkerAssignmentList worker1:customer1 worker2:customer2a,customer2b ...
* MaxFullfillmentTime numberOfMinutes

https://blog.newrelic.com/2016/02/22/8-ways-become-a-better-coder/
https://www.techrepublic.com/article/10-tips-for-becoming-a-better-programmer/
https://www.techrepublic.com/blog/software-engineer/10-tips-to-go-from-a-beginner-to-an-intermediate-developer/#.
https://hackernoon.com/surefire-ways-to-become-a-better-coder-b52c8cb33161
