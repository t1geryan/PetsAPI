package io.github.t1geryan.data

import io.github.t1geryan.models.Product

object ProductsStore {

    private val products = mutableListOf(
        Product(
            id = "monge-cat-salmon-1500",
            name = "ЛУМПИКО",
            description = "Корм для стерилизованных кошек",
            details = "Полнорационный сухой корм с лососем для взрослых стерилизованных кошек. Подходит для ежедневного кормления. Обеспечьте питомцу постоянный доступ к свежей воде.",
            animalType = "cat",
            categoryID = "cat-food",
            price = 1890,
            taste = "Лосось",
            weight = 1.5,
            imageName = "lumpikoCatSalmon",
            discount = 17,
            currencyCode = "RUB"
        ),
        Product(
            id = "grandorf-dog-lamb-3000",
            name = "ЛУМПИКО",
            description = "Корм для взрослых собак",
            details = "Сухой корм с ягнёнком и рисом для взрослых собак. Размер порции подбирайте с учётом веса, возраста и активности питомца.",
            animalType = "dog",
            categoryID = "dog-food",
            price = 3290,
            taste = "Ягнёнок и рис",
            weight = 3.0,
            imageName = "lumpikoDogLambRice",
            discount = null,
            currencyCode = "RUB"
        ),
        Product(
            id = "lapka-smallpet-grain-500",
            name = "ЛУМПИКО",
            description = "Зерновая смесь для хомяков",
            details = "Смесь злаков и семян для взрослых хомяков. Дополняйте рацион разрешёнными свежими продуктами и ежедневно меняйте питьевую воду.",
            animalType = "smallPet",
            categoryID = "small-pet-food",
            price = 390,
            taste = "Злаки",
            weight = 0.5,
            imageName = "lumpikoHamsterGrains",
            discount = 10,
            currencyCode = "RUB"
        ),
        Product(
            id = "monge-cat-turkey-1500",
            name = "Лапка",
            description = "Корм для домашних кошек",
            details = "Полнорационный сухой корм с индейкой для взрослых домашних кошек. Храните упаковку плотно закрытой в сухом прохладном месте.",
            animalType = "cat",
            categoryID = "cat-food",
            price = 1790,
            taste = "Индейка",
            weight = 1.5,
            imageName = "lapkaCatTurkey",
            discount = null,
            currencyCode = "RUB"
        ),
        Product(
            id = "grandorf-dog-duck-1000",
            name = "Лапка",
            description = "Корм для собак мелких пород",
            details = "Сухой корм с уткой для взрослых собак мелких пород. Небольшие гранулы удобно разгрызать. Переводите питомца на новый рацион постепенно.",
            animalType = "dog",
            categoryID = "dog-food",
            price = 1490,
            taste = "Утка",
            weight = 1.0,
            imageName = "lapkaDogDuck",
            discount = 15,
            currencyCode = "RUB"
        ),
        Product(
            id = "lapka-smallpet-herbs-1000",
            name = "Лапка",
            description = "Корм для морских свинок",
            details = "Смесь на основе трав и злаков для взрослых морских свинок. В рационе также должно быть сено, а в поилке — свежая вода.",
            animalType = "smallPet",
            categoryID = "small-pet-food",
            price = 690,
            taste = "Травы и злаки",
            weight = 1.0,
            imageName = "lapkaGuineaPigHerbs",
            discount = null,
            currencyCode = "RUB"
        ),
        Product(
            id = "lapka-cat-salmon-1500",
            name = "Лапка",
            description = "Корм для стерилизованных кошек",
            details = "Полнорационный сухой корм с лососем для взрослых стерилизованных кошек. Подходит для ежедневного кормления. Обеспечьте питомцу постоянный доступ к свежей воде.",
            animalType = "cat",
            categoryID = "cat-food",
            price = 1890,
            taste = "Лосось",
            weight = 1.5,
            imageName = "lapkaCatSalmon",
            discount = 17,
            currencyCode = "RUB"
        ),
        Product(
            id = "lapka-dog-lamb-3000",
            name = "Лапка",
            description = "Корм для взрослых собак",
            details = "Сухой корм с ягнёнком и рисом для взрослых собак. Размер порции подбирайте с учётом веса, возраста и активности питомца.",
            animalType = "dog",
            categoryID = "dog-food",
            price = 3290,
            taste = "Ягнёнок и рис",
            weight = 3.0,
            imageName = "lapkaDogLambRice",
            discount = null,
            currencyCode = "RUB"
        ),
        Product(
            id = "lapka-hamster-grains-500",
            name = "Лапка",
            description = "Зерновая смесь для хомяков",
            details = "Смесь злаков и семян для взрослых хомяков. Дополняйте рацион разрешёнными свежими продуктами и ежедневно меняйте питьевую воду.",
            animalType = "smallPet",
            categoryID = "small-pet-food",
            price = 390,
            taste = "Злаки",
            weight = 0.5,
            imageName = "lapkaHamsterGrains",
            discount = 10,
            currencyCode = "RUB"
        )
    )

    fun getProducts(): List<Product> = products.toList()
}