const express=require("express");
const redis= require("redis");

const client =redis.createClient({
    host:"redis-server",
    post:6379
})
const app=express();

client.set("number",0);
app.get('/',(req,res)=>{
    client.get("number",(err,number)=>{
        client.set('number',parseInt(number) + 1);
        res.send('숫자 1씩증가 :'+number);
    })
})
app.listen(8080);
console.log("server run")