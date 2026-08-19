# CS-305-12172-M01-Software-Security-2026-C-4
1. Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?

Artemis Financial is a financial services company that provides customers with financial planning and investment-related services. Because the company handles sensitive customer information, it needed its software applications to be secure, reliable, and compliant with industry security standards. The primary issue Artemis Financial wanted addressed was identifying and remediating software security vulnerabilities that could expose customer data or compromise the integrity of its systems. The company specifically needed a secure communications solution and improved protections against potential cyber threats.

2. What did you do well when you found your client's software security vulnerabilities? Why is it important to code securely? What value does software security add to a company's overall well-being?

I effectively used vulnerability assessment tools to identify security weaknesses within the application's dependencies and configurations. I carefully reviewed the findings, prioritized vulnerabilities based on risk, and implemented appropriate security controls to reduce exposure.

Secure coding is important because it protects sensitive information from unauthorized access, data breaches, and malicious attacks. It helps ensure the confidentiality, integrity, and availability of data. Software security adds value to a company's overall well-being by protecting customer trust, reducing financial and legal risks, supporting regulatory compliance, and maintaining the organization's reputation.

3. Which part of the vulnerability assessment was challenging or helpful to you?

The most challenging aspect of the vulnerability assessment was analyzing the scan results and determining which vulnerabilities required remediation versus those that represented acceptable or low-risk findings. Understanding dependency-related vulnerabilities and identifying appropriate mitigation strategies required careful evaluation.

The most helpful part was learning how automated security tools can quickly identify weaknesses that may not be immediately visible during manual code reviews. These tools provided valuable insight into potential risks and reinforced the importance of proactive security testing throughout the software development lifecycle.

4. How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

I increased security by implementing secure communication through the use of SSL/TLS certificates and HTTPS connections, updating vulnerable dependencies, and following secure coding best practices. These measures reduced risks associated with data transmission and software vulnerabilities.

In the future, I would continue using vulnerability scanning tools such as OWASP Dependency-Check, static code analysis tools, and security frameworks such as the OWASP Top Ten. I would assess vulnerabilities based on severity, likelihood, and business impact to determine the most effective mitigation techniques.

5. How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

To verify functionality, I tested the application after making code changes to ensure all intended features continued to operate correctly. I also confirmed that secure communications were functioning properly and that the application compiled and executed without errors.

After refactoring the code, I reran vulnerability scans and reviewed the results to verify that previously identified issues had been resolved and that no new vulnerabilities had been introduced. This process helped validate both the security and functionality of the application.

6. What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

Several resources and tools from this project will be valuable in future work, including:

OWASP Dependency-Check for identifying vulnerable dependencies.
Maven dependency management for maintaining secure libraries.
Java Keytool for generating certificates.
HTTPS and TLS implementation practices for secure communication.
Secure coding principles such as input validation, least privilege, and dependency management.
Security documentation and vulnerability reports for risk assessment and remediation planning.

These tools and practices can help improve software quality, security, and compliance in future projects.

7. Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

I would show future employers the completed vulnerability assessment report, evidence of security remediation efforts, and the refactored application demonstrating secure communications through HTTPS. This project highlights my ability to identify security risks, analyze vulnerability reports, implement security controls, work with industry-standard security tools, and validate that applications remain both functional and secure after changes. It demonstrates practical experience in secure software development and cybersecurity best practices, which are valuable skills in modern software engineering environments.
