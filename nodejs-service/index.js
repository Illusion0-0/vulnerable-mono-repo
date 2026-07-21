// Vulnerable Node.js service (hackathon demo target)
const express = require('express');
const app = express();
app.get('/', (req, res) => res.send('vulnerable'));
app.listen(3000);
