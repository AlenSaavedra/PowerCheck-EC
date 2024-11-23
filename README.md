# PowerCheck EC

**PowerCheck EC** es una aplicación web que permite a los clientes de CNEL (Corporación Nacional de Electricidad) en Ecuador consultar los cortes de luz a nivel nacional. El sistema utiliza una API pública de CNEL y está desarrollado con **Java Spring Boot** en el backend y **Thymeleaf** en el frontend.

## Descripción

La aplicación permite a los usuarios ingresar su documento de identidad, código único o número de contrato para consultar si existen cortes de luz en su localidad. La respuesta se obtiene de la API pública de CNEL, mostrando la información correspondiente sobre los cortes de energía programados o emergentes.

## Características

- Consulta de cortes de luz a nivel nacional.
- Soporte para los clientes de CNEL con número de contrato o documento de identidad.
- Interfaz de usuario intuitiva utilizando Thymeleaf.
- Obtención de datos en tiempo real desde la API pública de CNEL.

## Tecnologías Utilizadas

- **Java Spring Boot**: Framework para el backend.
- **Thymeleaf**: Plantilla para el frontend.
- **API pública de CNEL**: Para obtener información sobre cortes de luz.
- **Maven**: Para la gestión de dependencias y construcción del proyecto.

## Instalación

1. Clona este repositorio:
   ```bash
   git clone https://github.com/usuario/PowerCheck-EC.git
   ```

2. Navega al directorio del proyecto:
   ```bash
   cd PowerCheck-EC
   ```

3. Instala las dependencias con Maven:
   ```bash
   mvn install
   ```

4. Ejecuta el proyecto:
   ```bash
   mvn spring-boot:run
   ```

5. Accede a la aplicación desde tu navegador en [http://localhost:8080](http://localhost:8080).

## Uso

1. **Ingresa tu documento de identidad, código único o número de contrato**:  
   Para comenzar la consulta, ingresa tu información en el campo correspondiente.

   ![Ingresar documento de identidad, número de contrato o  código único]
   ![Consulta](https://github.com/user-attachments/assets/92d7a9b9-6838-45dc-a9f0-a92434742be6)

2. **Ver los resultados**:  
   Una vez que hayas ingresado la información, presiona el botón para consultar. Los resultados de la consulta se mostrarán en la página.

   ![Resultado de la consulta]
   ![image](https://github.com/user-attachments/assets/9906f611-f5e5-4110-ae2c-eb82ac0b5764)


## Contribuciones

Si deseas contribuir a este proyecto, sigue estos pasos:

1. Haz un fork de este repositorio.
2. Crea una rama con tu nueva funcionalidad (`git checkout -b feature/mi-nueva-funcionalidad`).
3. Realiza tus cambios.
4. Haz un commit con tus cambios (`git commit -m 'Añadir nueva funcionalidad'`).
5. Empuja tus cambios a tu repositorio (`git push origin feature/mi-nueva-funcionalidad`).
6. Abre un pull request.

## Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo [LICENSE](LICENSE) para más detalles.
