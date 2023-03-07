# Enunciados

### Fórmula 1

Supongamos que trabajas en una empresa que provee software para el análisis de datos de carreras de Fórmula 1. 
El equipo de desarrollo necesita crear un sistema para modelar diferentes aspectos de los coches de Fórmula 1.
Para cumplir con los requisitos del cliente, debes crear una clase `CocheF1` con propiedades como `modelo`, 
`potencia`, `velocidadMaxima`, `neumaticos` y `alerones`. Además, debes agregar métodos como `acelerar()`, 
`frenar()`, `cambiarNeumaticos()` y `ajustarAlerones()`.

Luego, debes crear una subclase llamada `CocheMercedes`, que hereda de `CocheF1` y agrega propiedades y 
métodos específicos de Mercedes. Por ejemplo, podrías agregar una propiedad `sistemaHibrido` y un método 
`usarSistemaHibrido()`.

Escribe un programa Java que cree una instancia de `CocheMercedes` y llame a sus métodos para simular una 
carrera de Formula 1. El programa debe imprimir los valores de las propiedades del coche y su velocidad en 
cada vuelta.


### Minecraft

Supongamos que estamos desarrollando un videojuego similar a Minecraft y necesitamos modelar diferentes 
tipos de bloques en el juego. Para ello, vamos a crear una clase `Bloque` como clase padre, que tendrá 
propiedades y métodos comunes a todos los tipos de bloques. A continuación, vamos a crear tres clases hijas con 
diferentes propiedades y métodos específicos para cada tipo de bloque: `BloqueMadera`, `BloquePiedra` y 
`BloqueHielo`.

La clase `Bloque` tendrá las propiedades `nombre`, `dureza`, `resistencia` y `textura`, y los métodos `romper()`
y `colocar()`. La clase `BloqueMadera` heredará de `Bloque` y tendrá una propiedad adicional de `tipoMadera` y 
un método `quemar()`. La clase `BloquePiedra` también heredará de `Bloque` y tendrá una propiedad `tipoPiedra` y 
un método `fundir()`. Finalmente, la clase `BloqueHielo` heredará de `Bloque` y tendrá una propiedad adicional 
`resbaladizo` y un método `derretir()`.

Escribe un programa principal en Java que cree una instancia de cada clase de bloque y use sus métodos para simular
diferentes acciones del juego. Por ejemplo, podrías romper un bloque de madera y colocarlo en otro lugar, fundir un 
bloque de piedra para obtener materiales y derretir un bloque de hielo para crear agua. El programa debe imprimir 
los valores de las propiedades y los resultados de las acciones realizadas.


### Espias 

Supongamos que trabajas en un programa de espionaje para una agencia gubernamental y necesitas modelar diferentes 
tipos de agentes de espionaje. Para ello, vamos a crear una clase `Agente` como clase padre, que tendrá propiedades
y métodos comunes a todos los agentes. A continuación, vamos a crear tres clases hijas con diferentes propiedades y
métodos específicos para cada tipo de agente: `AgenteSecreto`, `AgenteDoble` y `AgenteInfiltrado`.

La clase `Agente` tendrá las propiedades nombre, edad, nacionalidad, objetivo y ubicacion, y los métodos espiar() y
informar(). La propiedad objetivo se refiere al objetivo del espionaje y la propiedad ubicacion se refiere a la 
ubicación actual del agente. Ambas propiedades tendrán el modificador de acceso protected para que puedan ser 
accedidas por las clases hijas. La clase `AgenteSecreto` heredará de Agente y tendrá una propiedad adicional de 
codigoSecreto y un método descifrarCodigo(). La clase `AgenteDoble` también heredará de Agente y tendrá una propiedad nombreAlterno y un método engañar(). Finalmente, la clase `AgenteInfiltrado` heredará de Agente y tendrá una propiedad adicional organizacion y un método filtrar().

Escribe un programa principal en Java que cree una instancia de cada clase de agente y use sus métodos para simular 
diferentes acciones de espionaje. Por ejemplo, podrías hacer que un agente secreto descifre un código secreto, que 
un agente doble engañe a dos organizaciones rivales, y que un agente infiltrado filtre información confidencial. El 
programa debe imprimir los valores de las propiedades y los resultados de las acciones realizadas.
