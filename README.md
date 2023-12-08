# SOAP API Loan Eligibility Service

This Java application contains a SOAP-based Loan Eligibility Service. It evaluates a customer's eligibility for a loan based on certain criteria provided in the `CustomerRequest`.

## Overview

The `LoanEligibilityService` is a Spring `@Service` class that performs eligibility checks for loan approval. It takes a `CustomerRequest` object containing information about the customer and returns an `Acknowledgement` indicating whether the customer is eligible for a loan and the approved loan amount.

## Usage

The `checkLoanEligibility` method within the `LoanEligibilityService` class performs the following checks based on the criteria:

- **Age Criteria**: The person's age should be between 30 to 60 years.
- **Yearly Income**: Minimum income required is more than 200,000.
- **CIBIL Score**: Should be greater than 500.

If any of these criteria are not met, the corresponding mismatch details are added to the `Acknowledgement` object's `criteriaMismatch` list.

If the customer meets all criteria, they are approved for a loan of 500,000 and marked as eligible.

## Configuration

No external configuration is required for this service.

## How to Use

1. **Integration**: Integrate this service into your SOAP-based application by using the provided methods, especially the `checkLoanEligibility` method.
2. **Input**: Create a `CustomerRequest` object with appropriate age, yearly income, and CIBIL score to check loan eligibility.
3. **Output**: Obtain the `Acknowledgement` object returned by the `checkLoanEligibility` method to determine the customer's loan eligibility and approved amount.

## Contributing

Contributions to enhance the eligibility criteria, error handling, or any additional features are welcome. Feel free to fork this repository, make changes, and create a pull request.

## License

This project is licensed under the [MIT License](LICENSE).


# LoanSoap
a SOAP endpiont api 
## link http://localhost:8080/ws/loanEligibility.wsdl in soapui app  

download here [ https://www.soapui.org/downloads/thank-you-for-downloading-soapui/]



![Screenshot (37)](https://user-images.githubusercontent.com/38097150/125631362-e8db3cfc-479c-4fae-b2d0-8d8bdb39b274.png) 
