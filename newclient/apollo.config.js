module.exports = {
    client: {
        service: {
            name: 'api',
            url: process.env.SERVER_URL || 'http://localhost:4000/',
            includes: ['**/*.graphql'],
            excludes: ['node_modules/**/*']
        }
    }
}
