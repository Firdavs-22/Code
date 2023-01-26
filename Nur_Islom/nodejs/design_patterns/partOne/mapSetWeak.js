/*WeakMap is quite similar to Map in terms of interface; however, there are two main differences you should be aware of:
there is no way to iterate all over the entries, and it only allows having objects as keys. While this might seem like a
limitation, there is a good reason*/
let obj = {};
const map = new WeakMap();
map.set(obj, {key: "some_value"});
console.log(map.get(obj)); // {key: "some_value}
obj = undefined; // now obj and associated data in the map will be cleaned up in the next gc cycle
/*It's important to understand that WeakMap and WeakSet are not better or worse than Map and Set,
they are simply more suitable for different use cases.*/