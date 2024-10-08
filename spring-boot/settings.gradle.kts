include(
    "gateways:seller-bff:api",
    "gateways:seller-bff:unit-tests",
    "gateways:shopper-bff:api",
    "gateways:shopper-bff:unit-tests",
    "gateways:administration-bff:api",
    "gateways:administration-bff:unit-tests"
)

include(
    "domain-model:identity:contracts",
    "domain-model:identity:model",
    "domain-model:identity:adapters",
    "domain-model:identity:api",
    "domain-model:identity:unit-tests"
)
