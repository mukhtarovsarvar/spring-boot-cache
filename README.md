# Hibernate Second-Level Cache Statistics with Ehcache

This document provides statistics from a Spring Boot application using Hibernate as the ORM and Ehcache as the
second-level cache provider. The statistics cover JDBC connection management, statement execution, and cache
interactions.

## Cache Configuration

- **Cache Provider:** Ehcache
- **Cache Level:** Second-Level Cache (L2C)
- **Database:** PostgresSQL

## Log Analysis

The following statistics were captured during the execution of the application.

### First Request: Fetching Person by ID `2`

- **Time:** 2024-09-04T15:10:35.531+05:00
- **Query Executed:**
  ```sql
  select p1_0.id, p1_0.name from person p1_0 where p1_0.id=?
  ```
- Session Metrics:
    - JDBC Connection Acquisition:
        - 448,300 nanoseconds spent acquiring 1 JDBC connection
    - JDBC Statement Preparation:
        - 234,100 nanoseconds spent preparing 1 JDBC statement
    - JDBC Statement Execution:
        - 1,396,900 nanoseconds spent executing 1 JDBC statement
    - Second-Level Cache (L2C):
        - 7,418,300 nanoseconds spent performing 1 L2C put
        - 570,000 nanoseconds spent performing 1 L2C miss

### Second Request: Fetching Person by ID `2`

- Time: 2024-09-04T15:11:03.681+05:00
- Session Metrics:
    - JDBC Connection Acquisition:
        - 314,700 nanoseconds spent acquiring 1 JDBC connection
    - JDBC Statement Execution:
        - No JDBC statements were prepared or executed
    - Second-Level Cache (L2C):
        - 348,900 nanoseconds spent performing 1 L2C hit

This `README.md` file summarizes the cache usage statistics based on the provided log entries. It highlights the
efficiency of the second-level cache in reducing database load during subsequent requests.
