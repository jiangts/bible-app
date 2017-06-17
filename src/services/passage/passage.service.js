// Initializes the `passage` service on path `/passage`
const createService = require('feathers-nedb');
const createModel = require('../../models/passage.model');
const hooks = require('./passage.hooks');
const filters = require('./passage.filters');

module.exports = function () {
  const app = this;
  const Model = createModel(app);
  const paginate = app.get('paginate');

  const options = {
    name: 'passage',
    Model,
    paginate
  };

  // Initialize our service with any options it requires
  app.use('/passage', createService(options));

  // Get our initialized service so that we can register hooks and filters
  const service = app.service('passage');

  service.hooks(hooks);

  if (service.filter) {
    service.filter(filters);
  }
};
