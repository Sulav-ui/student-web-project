import { useState } from "react";

const [price, setPrice] = useState();
const [quantity, setQuantity] = useState();
const total = price * quantity;
