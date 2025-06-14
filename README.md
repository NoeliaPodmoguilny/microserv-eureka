# microserv-eureka

Este repositorio contiene un proyecto de microservicios utilizando Spring Cloud Netflix Eureka como servidor de descubrimiento de servicios. 
Eureka permite que los microservicios se registren y descubran entre sí de forma dinámica, facilitando la escalabilidad y la gestión en arquitecturas distribuidas.

## Características

- Implementación de Eureka Server para registro y descubrimiento de microservicios.
- Preparado para integrarse con clientes Eureka (Eureka Clients).
- Configuración sencilla y extensible basada en Spring Boot.
- Facilita la comunicación y escalabilidad entre microservicios.

## Estructura del proyecto

```
/
├── src/
│   ├── main/
│   │   ├── java/                      # Código fuente principal
│   │   │   └── ...                    # Paquetes de la app Eureka
│   │   └── resources/
│   │       ├── application.properties # Configuración de Eureka
│   │       └── ...
│   └── test/                          # Pruebas unitarias (si aplica)
├── pom.xml                            # Dependencias Maven
├── README.md
└── ...
```

## ¿Cómo ejecutar el proyecto?

1. Clona el repositorio:
   ```bash
   git clone https://github.com/NoeliaPodmoguilny/microserv-eureka.git
   ```
2. Abre el proyecto en tu IDE favorito (Eclipse, IntelliJ IDEA, VS Code, etc.).
3. Asegúrate de tener Java 17 o superior y Maven instalados.
4. Ejecuta el siguiente comando en la raíz del proyecto:
   ```bash
   mvn spring-boot:run
   ```
5. Accede al panel de Eureka en [http://localhost:8761](http://localhost:8761).

## Recursos útiles

- [Documentación de Spring Cloud Netflix Eureka](https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-eureka-server.html)
- [Guía de microservicios con Spring Boot](https://spring.io/guides/gs/service-registration-and-discovery/)


**Autora:** [Noelia Podmoguilny](https://github.com/NoeliaPodmoguilny)
