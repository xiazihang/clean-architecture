package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

public record Address(UUID id, String street, String postalCode, String city) {

}
