# PowerCheck EC

**PowerCheck EC** is a web application that allows CNEL (Corporación Nacional de Electricidad) customers in Ecuador to check power outages nationwide. The system uses a public CNEL API and is developed with **Java Spring Boot** in the backend and **Thymeleaf** in the frontend.

## Description

The application allows the user to enter their identity document, unique code or contract number to check if there are power outages in their location. The response is obtained from the CNEL public API, showing the corresponding information about scheduled or emergency power outages.

## Features

- Query of power outages nationwide.
- Support for CNEL customers with contract number or identity document.
- Intuitive user interface using Thymeleaf.
- Obtaining data in real time from the CNEL public API.

## Technologies Used

- **Java Spring Boot**: Framework for the backend.
- **Thymeleaf**: Frontend template.
- **CNEL Public API**: For getting information about interruptions.
- **Maven**: For dependency management and project creation.

## Installation

1. Clone this repository:
```bash
git clone https://github.com/user/PowerCheck-EC.git
```

2. Navigate to the project directory:
```bash
cd PowerCheck-EC
```

3. Install the dependencies with Maven:
```bash
mvn install
```

4. Run the project:
```bash
mvn spring-boot:run
```

5. Access the application from your browser at [http://localhost:8080](http://localhost:8080).

## Usage

1. **Enter your ID, unique code, or contract number**:
To start the query, enter your information in the corresponding field.

![Query](https://github.com/user-attachments/assets/92d7a9b9-6838-45dc-a9f0-a92434742be6)

2. **View the results**:
Once you have entered the information, press the button to perform the query. The results of the query will be displayed on the page.

![image](https://github.com/user-attachments/assets/9906f611-f5e5-4110-ae2c-eb82ac0b5764)

## Contributions

If you want to contribute to this project, follow these steps:

1. Fork this repository.
2. Create a branch with your new feature (`git checkout -b feature/my-new-feature`).
3. Commit your changes.
4. Commit your changes (`git commit -m 'Add new feature'`).
5. Push your changes to your repository (`git push origin feature/my-new-feature`).
6. Open a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.
