# Week 7 Notes: DevOps, Cloud & Generative AI

This document contains the basic concepts learned in Week 7 of the Java + React Full Stack Engineering program.

---

# 1. DevOps & CI/CD

## What is DevOps?

DevOps is a software development approach that brings together **Development** and **Operations** teams to build, test, and deploy applications faster and more efficiently.

### DevOps Lifecycle

* Plan
* Code
* Build
* Test
* Release
* Deploy
* Monitor

## CI/CD

### Continuous Integration (CI)

* Developers frequently merge code into a shared repository.
* Code is automatically built and tested.

### Continuous Delivery (CD)

* After testing, the application is ready for deployment.
* Deployment is done with minimal manual effort.

### Continuous Deployment

* Every successful code change is automatically deployed to production.

---

# 2. Docker

## What is Docker?

Docker is a platform used to package applications and their dependencies into **containers** so they can run the same way on any system.

## Important Concepts

### Docker Image

A blueprint used to create containers.

### Docker Container

A running instance of a Docker image.

### Dockerfile

A file containing the instructions to build a Docker image.

### Containers vs Virtual Machines

| Containers    | Virtual Machines |
| ------------- | ---------------- |
| Lightweight   | Heavyweight      |
| Share host OS | Have separate OS |
| Start quickly | Start slowly     |

## Common Docker Commands

```bash
docker build -t image-name .
docker run -d -p 8080:80 image-name
docker ps
docker stop <container-id>
docker images
```

---

# 3. Cloud Computing

## What is Cloud Computing?

Cloud computing provides services like servers, storage, databases, and software over the internet on a pay-as-you-use basis.

## Cloud Deployment Models

* **Public Cloud** – Shared cloud services (AWS, Azure, Google Cloud)
* **Private Cloud** – Used by a single organization
* **Hybrid Cloud** – Combination of public and private cloud

## Cloud Service Models

### IaaS (Infrastructure as a Service)

Provides virtual machines, storage, and networking.

**Example:** AWS EC2, Azure Virtual Machines

### PaaS (Platform as a Service)

Provides a platform for developing and deploying applications.

**Example:** Heroku, AWS Elastic Beanstalk

### SaaS (Software as a Service)

Provides ready-to-use software over the internet.

**Example:** Gmail, Google Workspace, Microsoft 365

---

# 4. Generative AI

## What is Generative AI?

Generative AI is a type of Artificial Intelligence that can create new content such as text, images, code, audio, and videos.

## Key Concepts

### Large Language Models (LLMs)

AI models trained on large amounts of data to understand and generate human language.

**Examples:** ChatGPT, Gemini, Claude

### Prompt

The instruction or question given to an AI model.

### Prompt Engineering

Writing clear and effective prompts to get accurate and useful responses from AI.

---

# Summary

In Week 7, I learned:

* DevOps and CI/CD concepts
* Docker and containerization
* Cloud Computing basics
* Cloud deployment and service models
* Generative AI fundamentals
* Large Language Models (LLMs)
* Prompt Engineering

---

## Reference

For the complete training overview, refer to:

`WEEK7/Readme.md`
