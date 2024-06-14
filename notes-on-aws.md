Sure, here's the updated version with additional details:

```markdown
# Cloud Computing

## Server
- AWS (Amazon Web Services): A leading cloud service provider known for its wide range of services including computing power, storage solutions, and networking capabilities.
- Azure (Microsoft Azure): Microsoft's cloud computing platform offering various services such as virtual machines, databases, and developer tools.
- GCP (Google Cloud Platform): Google's suite of cloud computing services providing infrastructure, data analytics, and machine learning tools.

## 3 Types of Services
- **IaaS - Infrastructure as a Service**: Provides virtualized computing resources over the internet. Users can rent virtual machines, storage, and networking resources.
  - Examples:
    - EC2 (Elastic Compute Cloud) - AWS
    - Virtual Machines - Azure
    - Compute Engine - GCP
- **PaaS - Platform as a Service**: Offers a platform allowing customers to develop, run, and manage applications without dealing with the underlying infrastructure.
  - Examples:
    - AWS Elastic Beanstalk: Automates the deployment and scaling of web applications.
    - Azure App Service: A fully managed platform for building, deploying, and scaling web apps.
    - Google App Engine: A serverless platform for developing and hosting web applications at scale.
- **SaaS - Software as a Service**: Delivers software applications over the internet on a subscription basis. Users access the application via a web browser.
  - Examples:
    - Office 365: Microsoft's suite of productivity tools including Word, Excel, and Outlook delivered as a service.
    - Salesforce: A cloud-based customer relationship management (CRM) platform offering various business solutions.

## 3 Types of Deployment Models
- **Public Cloud**: Services are provided over the public internet and accessible to anyone who wants to use or purchase them.
  - Examples:
    - AWS
    - Azure
    - GCP
- **Private Cloud**: Infrastructure and services are maintained on a private network and dedicated to a single organization.
  - Examples:
    - VMware: Provides virtualization software for creating and managing virtualized data centers.
    - OpenStack: Open-source software for building private and public clouds.
- **Hybrid Cloud**: Combines public and private cloud environments, allowing data and applications to be shared between them.
  - Example:
    - AWS Outposts: Extends AWS infrastructure, services, and tools to virtually any data center, co-location space, or on-premises facility.

## Advantages of Cloud Computing
- **Scalability**: Easily scale resources up or down based on demand, avoiding over-provisioning or under-provisioning.
- **Flexibility**: Access to a wide range of services and configurations to meet specific business requirements.
- **Cost-Efficiency**: Pay only for the resources you use, reducing upfront costs and eliminating the need for hardware procurement.
- **Automatic Updates**: Cloud providers manage hardware and software updates, ensuring systems are always up-to-date.
- **Accessibility**: Access cloud services from anywhere with an internet connection, enabling remote work and collaboration.

## Challenges
- **Internet Connection**: Dependence on stable internet connectivity for accessing cloud services and data.
- **Security**: Concerns about data privacy, compliance, and protection against cyber threats.
- **Cost**: Management of expenses, potential hidden costs, and optimizing resource usage to minimize expenditure.
- **Downtime**: Risk of service interruptions due to technical issues, maintenance, or cyber attacks.
- **Limited Control**: Less control over infrastructure and environment compared to on-premises solutions, requiring trust in the cloud provider's capabilities.

## Regions and Availability Zones

### EC2 - Elastic Compute Cloud - Virtual Machine on AWS
- **Types**:
  - General Purpose - t3, t2, m5: Balanced performance for diverse workloads.
  - Compute Optimized - c5, c4: High-performance computing for compute-bound applications.
  - Memory Optimized - r5, x1: Optimized for memory-intensive workloads like databases and analytics.
  - Storage Optimized - i3, h1: Optimized for storage-intensive applications requiring high I/O performance.
  - Accelerated Computing - g4, g3, f1, p3: Suitable for graphics processing, machine learning, and scientific simulations.
- **Volumes**:
  - General Purpose SSD - gp3, gp2: Balanced price/performance for a wide range of workloads.
  - Provisioned IOPS - io2, io1: High-performance SSD volumes designed for I/O-intensive applications.
  - Throughput Optimized HDD - st1: Low-cost HDD volumes for frequently accessed, throughput-intensive workloads.
  - Cold HDD - sc1: Lowest cost HDD volumes for less frequently accessed data.

### Best Practices
- **Use Case**:
  - Web Application - t3 + gp3: Balanced performance and cost-effective storage for web servers.
  - High-Performance Computing - c5 + gp3: High-performance computing with fast storage for compute-intensive workloads.
  - In Memory Database - r5, io2: Memory-optimized instances with high-performance storage for database applications.
  - Machine Learning - p3: Accelerated computing instances with powerful GPUs for machine learning and deep learning workloads.
- **VPC - Virtual Private Cloud**: Isolates cloud resources and provides control over network configuration.
- **Subnets**:
  - Public Subnets: Directly accessible from the internet.
  - Private Subnets: Isolated from the internet, accessible only from within the VPC.
- **Internet Gateways**, **NAT Gateway**, **Route Table**, **Network ACL**, **Security Groups**, **Elastic IP Address**: Networking components for controlling traffic and securing resources.
- **IAM - Identity and Access Management**:
  - Users, User Groups: Manage access to AWS services and resources.
  - IAM Roles: Grant permissions to entities like EC2 instances to access other AWS services.
  - Policies: Define permissions using JSON documents.

## AWS Elastic Beanstalk
- Managed Service for deploying apps

**IMP Before we start**
- **Roles and Permissions**

### Create a role with the name:
`aws-elasticbeanstalk-ec2-role`

### Add the following permissions to the role:
- `AWSElasticBeanstalkWebTier`: Permissions required for deploying web applications.
- `AWSElasticBeanstalkMulticontainerDocker`: Permissions required for deploying Docker containers.

### Step 1 - Configure environment:
- Create Environment -> Web server environment
- Provide a name eg - "hello-spring-app"
- Select managed platform -> Java
- Application code -> Sample application
- Presets -> Single instance

### Next: Configure service access
- For the first time, choose "Create and use a new service role"
- Next time onwards, use the existing one
- EC2 instance profile should be set to "aws-elasticbeanstalk-ec2-role"

### Next: Set up networking, database, and tags
- Choose a VPC
- Activate Public IP address
- Select a subnet "us-east-1a"

### Next: Configure instance traffic and scaling
### Next: Configure updates, monitoring, and logging
### Next: Review and Submit
- Wait for 5-8 Minutes
- Visit the domain to browse your app

## Upload and deploy your code
- Deploy the code and wait for a few minutes
- Visit the domain to browse your app
```

