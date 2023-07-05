export
record DataStore (schema : Schema) where
    constructor MkData
    size : Nat
    items : Vect size (SchemaType schema)