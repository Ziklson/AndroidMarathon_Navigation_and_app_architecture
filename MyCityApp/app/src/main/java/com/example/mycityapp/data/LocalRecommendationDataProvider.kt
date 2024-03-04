package com.example.mycityapp.data

import com.example.mycityapp.R
import com.example.mycityapp.model.Recommendation

object LocalRecommendationDataProvider {
    val recommendations: List<Recommendation> = listOf(
        Recommendation(
            id = 1,
            name = R.string.coffee_shop_1,
            category = R.string.category_1,
            address = R.string.coffee_shop_address_1,
            description = R.string.coffee_shop_description_1,
            imageResourceId = R.drawable.coffee_shop_1
        ),
        Recommendation(
            id = 2,
            name = R.string.coffee_shop_2,
            category = R.string.category_1,
            address = R.string.coffee_shop_address_2,
            description = R.string.coffee_shop_description_2,
            imageResourceId = R.drawable.coffee_shop_2
        ),
        Recommendation(
            id = 3,
            name = R.string.coffee_shop_3,
            category = R.string.category_1,
            address = R.string.coffee_shop_address_3,
            description = R.string.coffee_shop_description_3,
            imageResourceId = R.drawable.coffee_shop_3
        ),
        Recommendation(
            id = 4,
            name = R.string.restaurant_1,
            category = R.string.category_2,
            address = R.string.restaurant_address_1,
            description = R.string.restaurant_description_1,
            imageResourceId = R.drawable.restaurant_1
        ),
        Recommendation(
            id = 5,
            name = R.string.restaurant_2,
            category = R.string.category_2,
            address = R.string.restaurant_address_2,
            description = R.string.restaurant_description_2,
            imageResourceId = R.drawable.restaurant_2
        ),
        Recommendation(
            id = 6,
            name = R.string.restaurant_3,
            category = R.string.category_2,
            address = R.string.restaurant_address_3,
            description = R.string.restaurant_description_3,
            imageResourceId = R.drawable.restaurant_3
        ),
        Recommendation(
            id = 7,
            name = R.string.kid_friendly_place_1,
            category = R.string.category_3,
            address = R.string.kid_friendly_place_address_1,
            description = R.string.kid_friendly_place_description_1,
            imageResourceId = R.drawable.kid_friendly_1
        ),
        Recommendation(
            id = 8,
            name = R.string.kid_friendly_place_2,
            category = R.string.category_3,
            address = R.string.kid_friendly_place_address_2,
            description = R.string.kid_friendly_place_description_2,
            imageResourceId = R.drawable.kid_friendly_2
        ),
        Recommendation(
            id = 9,
            name = R.string.kid_friendly_place_3,
            category = R.string.category_3,
            address = R.string.kid_friendly_place_address_3,
            description = R.string.kid_friendly_place_description_3,
            imageResourceId = R.drawable.kid_friendly_3
        ),
        Recommendation(
            id = 10,
            name = R.string.park_1,
            category = R.string.category_4,
            address = R.string.park_address_1,
            description = R.string.park_description_1,
            imageResourceId = R.drawable.park_1
        ),
        Recommendation(
            id = 11,
            name = R.string.park_2,
            category = R.string.category_4,
            address = R.string.park_address_2,
            description = R.string.park_description_2,
            imageResourceId = R.drawable.park_2
        ),
        Recommendation(
            id = 12,
            name = R.string.park_3,
            category = R.string.category_4,
            address = R.string.park_address_3,
            description = R.string.park_description_3,
            imageResourceId = R.drawable.park_3
        ),
        Recommendation(
            id = 13,
            name = R.string.shopping_center_1,
            category = R.string.category_5,
            address = R.string.shopping_center_address_1,
            description = R.string.shopping_center_description_1,
            imageResourceId = R.drawable.shopping_center_1
        ),
        Recommendation(
            id = 14,
            name = R.string.shopping_center_2,
            category = R.string.category_5,
            address = R.string.shopping_center_address_2,
            description = R.string.shopping_center_description_2,
            imageResourceId = R.drawable.shopping_center_2
        ),
        Recommendation(
            id = 15,
            name = R.string.shopping_center_3,
            category = R.string.category_5,
            address = R.string.shopping_center_address_3,
            description = R.string.shopping_center_description_3,
            imageResourceId = R.drawable.shopping_center_3
        )
    )
}