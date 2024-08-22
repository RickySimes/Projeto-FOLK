<template>


    <header
        class="bg-gradient-to-r from-blue-600 to-purple-900 text-white py-4 shadow-lg fixed top-0 left-0 w-full z-50">
        <nav class="container mx-auto flex justify-center items-center space-x-8">
            <ul class="flex space-x-8 md:space-x-24 font-folk text-sm md:text-base">
                <li><router-link to="/" class="hover:text-gray-200">Home</router-link></li>
            </ul>
        </nav>
    </header>

    <div class="min-h-screen bg-gray-100 flex items-center justify-center font-folk">
        <div class="w-full max-w-md p-8 space-y-6 bg-white rounded-lg shadow-md">
            <h1 class="text-center text-2xl font-bold">Folk Azores</h1>
            <form @submit.prevent="handleLogin">
                <div class="mt-6">
                    <label for="email" class="block text-sm font-medium text-gray-700">Utilizador</label>
                    <input v-model="email" type="email" id="email" required
                        class="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500 sm:text-sm">
                </div>
                <div class="mt-6">
                    <label for="password" class="block text-sm font-medium text-gray-700">Password</label>
                    <input v-model="password" type="password" id="password" required
                        class="mt-1 block w-full px-3 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-blue-500 focus:border-blue-500 sm:text-sm">
                </div>
                <div class="flex items-center justify-between mt-4">
                </div>
                <div>
                    <button type="submit"
                        class="w-full flex justify-center py-2 px-4 border border-transparent rounded-md shadow-sm text-sm font-medium text-white bg-green-600 hover:bg-green-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-blue-500">
                        Sign in
                    </button>
                </div>
            </form>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            email: '',
            password: ''
        };
    },
    methods: {
        handleLogin() {
            const response = fetch('projeto-folk-production.up.railway.app/api/auth/login', {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify({ username: this.username, password: this.password }),
            });

            if (response.ok) {
                const data = response.json();
                localStorage.setItem('token', data.token);
            } else {
                console.error('Login failed');
            }
        }
    }
};
</script>

<style scoped>
@media (min-width: 768px) {
    .max-w-md {
        width: 100%;
        max-width: 28rem;
    }
}
</style>