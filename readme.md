# Dummy Virtual Account Services

Welcome to the Dummy Virtual Account Services project! This is a simple self-improvement project built with Spring Boot 3 and WebFlux, utilizing a PostgreSQL database.

## Project Overview

The Dummy Virtual Account Services project aims to provide a basic implementation of virtual account management using modern reactive programming techniques. Leveraging Spring Boot 3 and WebFlux, this project offers a reactive and non-blocking architecture for handling virtual account operations.

## Features

- Utilizes **Spring Boot 3** framework for rapid application development.
- Built on the principles of **reactive programming** using **WebFlux** for asynchronous, non-blocking operations.
- Backed by a **PostgreSQL** database with R2DBC Driver.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 17 or higher
- PostgreSQL database up and running
- Maven

## Getting Started

1. Clone the repository:
   ```git clone https://github.com/your-username/dummy-virtual-account-services.git```

2. Navigate to the project directory:
   ```cd dummy-virtual-account```

3. Build the project using Maven:
   ```mvn clean install```

4. Run the application:
   ```mvn spring-boot:run```

5. Access the swagger/docs at: `http://localhost:8080/api/v1/webjars/swagger-ui/index.html#`

## Data Migration (Separate Project)

For data migration. Follow these steps:

1. Clone the data migration repository:
```git clone https://github.com/vinzmc/Dummy-Virtual-Account-DM.git```

2. Navigate to the data migration project directory:
   ```cd Dummy-Virtual-Account-DM```

3. Follow the migration instructions provided in the data migration repository.

## Personal Comments

As the project creator, I would like to share a couple of personal observations and considerations:

1. The overall design pattern of the project is a work in progress. I am actively exploring ways to enhance the design and architecture over time to ensure scalability and maintainability.

2. One area of focus is the validation mechanism. While the project currently employs a validation approach that uses blocking, I am committed to finding a non-blocking solution to further align with the reactive principles of the project. I appreciate your understanding and patience as I work towards this improvement.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

If you have any questions or feedback, feel free to contact me at [maurice.marvin8812@gmail.com](mailto:maurice.marvin8812@gmail.com).

Happy coding!
