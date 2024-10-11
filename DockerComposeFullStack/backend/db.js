const mysql = require("mysql");
const pool = mysql.createPool({
    connectionLimit: 10,
    host: 'mysql',
    user: 'root',
    password: 'kim',
    database: 'mysql',
    port: '3309'
});
exports.pool = pool;