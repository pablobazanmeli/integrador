# Kotlin Integrator

### This project will recompile all the Kotlin knowledge learned in the first two weeks of the mobile bootcamp

#### Members:

- Esther Wiljephnie Obei
- Matias Rafael Lucero
- Pablo Martin Bazan

## Answers

#### ¿Por qué se define vehicles como un Set ?

Los Set es una colección de elementos que no pueden repetirse. Por lo que es ideal para definir
vehiculos como un conjunto. Además los Set permiten manipular los elementos de forma más eficiente.

#### Recuerda en qué se diferencian los Set de los Array. ¿Podrían existir dos vehículos iguales?

Un arreglo es una estructura de datos indexada que contiene un número fijo de elementos. En cambio,
un Set es una estructura de datos desordenada que no permite elementos duplicados.

Podrían existir dos vehiculos iguales en un array, pero en un Set no.

#### ¿Dónde deben agregarse las propiedades, en ParkingSpace, Vehicle o en ambos?

Ambas propiedades (checkInTime y discountCard) las declaramos en Vehicle. Asumimos que cuando el
vehiculo es instanciado ya se encuentra en el parking.

#### La tarjeta de descuentos es opcional, es decir que un vehículo puede no tener una tarjeta y su valor será null. ¿Cómo indicamos que un tipo de datos puede adquirir esta característica en Kotlin?

Está caracteristica en Kotlin es llamada null safety y se representa agregandole un simbolo de
interrogación al tipo de datos.

Ejemplo: val discountCard: String? = null