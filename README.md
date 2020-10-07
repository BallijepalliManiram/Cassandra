# Cassandra
- It is an open source.
- It is a distributed database for managing very large amounts of structured data spread out across the world. 
- It provides highly available service with no single point of failure.
- It is a NoSQL database.
- It is scalable, fault-tolerant, and consistent.
- It is a column-oriented database.
- Its distribution design is based on Amazon’s Dynamo and its data model on Google’s Bigtable.
- Created at Facebook, it differs sharply from relational database management systems.
- Cassandra implements a Dynamo-style replication model with no single point of failure, but adds a more powerful “column family” data model.
- Cassandra is being used by some of the biggest companies such as Facebook, Twitter, Cisco, Rackspace, ebay, Twitter, Netflix, and more.
# NoSQL database:           
- It is  type of database which provides a mechanism to store and retrieve the data other than the tabular relations used in relational databases.
- These databases were 
	1. schema-free  
	2. support easy replication  
	3. have simple API  
	4. eventually consistent 
	5. handle huge amounts of data
- In this we use different data structures compare to RDBMS.
- In this some operations were fastly excused.
- The suitability will depend on the problem it must solve.
# Features of Cassandra:
- Cassandra has become so popular because of its outstanding technical features. Given below are some of the features of Cassandra:
	1. **Elastic scalability** − Cassandra is highly scalable; it allows to add more hardware to accommodate more customers and more data as per requirement.
	2. **Always on architecture** − Cassandra has no single point of failure and it is continuously available for business-critical applications that cannot afford a failure.
	3. **Fast linear-scale performance** − Cassandra is linearly scalable, i.e., it increases your throughput as you increase the number of nodes in the cluster. Therefore it maintains a quick response time.
	4. **Flexible data storage** − Cassandra accommodates all possible data formats including: structured, semi-structured, and unstructured. It can dynamically accommodate changes to your data structures according to your need.
	5. **Easy data distribution** − Cassandra provides the flexibility to distribute data where you need by replicating data across multiple data centers.
	6. **Transaction support** − Cassandra supports properties like Atomicity, Consistency, Isolation, and Durability (ACID).
	7. **Fast writes** − Cassandra was designed to run on cheap commodity hardware. It performs blazingly fast writes and can store hundreds of terabytes of data, without sacrificing the read efficiency.
# CAP Theorem:
- This theorem states that based on the three characteristics:
	1. **Consistency:**
		i. Consistency means that all clients see the same data at the same time, no matter which node they connect to. 
		ii. For this to happen, whenever data is written to one node, it must be instantly forwarded or replicated to all the other nodes in the system before the write is deemed successful.
	2. **Availability:**
		i. Availability means that that any client making a request for data gets a response, even if one or more nodes are down. 
		ii. Another way to state this—all working nodes in the distributed system return a valid response for any request, without exception.		
	3. **Partition Tolerance:**
		i. A partition is a communications break within a distributed system—a lost or temporarily delayed connection between two nodes. 
		ii. Partition tolerance means that the cluster must continue to work despite any number of communication breakdowns between nodes in the system.

   **What is the CAP Theorem?**
	1. A distributed system always needs to be partition tolerant, we shouldn’t be making a system where a network partition brings down the whole system.
	2. So, a distributed system is always built Partition Tolerant.
	3. So, In simple words, CAP theorem means if there is network partition and if you want your system to keep functioning you can provide either Availability or Consistency and not both.
- It applies to similar type of logic to distributed systems means it can deliver only two of three desired characteristics.

# Installation Steps for Cassandra:
[Click here for Installation Steps for cassandra in windows](https://phoenixnap.com/kb/install-cassandra-on-windows)
 	
