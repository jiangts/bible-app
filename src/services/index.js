const users = require('./users/users.service.js');
const passage = require('./passage/passage.service.js');
module.exports = function () {
  const app = this; // eslint-disable-line no-unused-vars
  app.configure(users);
  app.configure(passage);
};
