const assert = require('assert');
const app = require('../../src/app');

describe('\'passage\' service', () => {
  it('registered the service', () => {
    const service = app.service('passage');

    assert.ok(service, 'Registered the service');
  });
});
