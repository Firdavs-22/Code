type NestedNumber = number | NestedNumber[];

const nums: NestedNumber = [1, 2, 3, [4, 5, [1]]];
nums.push(1);
nums.push([1, [12]]);

// JSON
type JSONPrimitive = string | number | boolean | null;
type JSONObject = { [key: string]: JSONValue };
type JSONArray = JSONValue[];
type JSONValue = JSONPrimitive | JSONObject | JSONArray;

function isJSON(args: JSONValue) {
}

isJSON([]);
isJSON(1);
isJSON('hi');
isJSON({a: 1});