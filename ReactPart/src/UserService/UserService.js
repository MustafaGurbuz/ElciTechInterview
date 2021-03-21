import axios from 'axios';

const USER_REST_API = 'http://localhost:3000/api/users';

class UserService {
    getUsers() {
        axios.get(USER_REST_API);
    };
};

export default new UserService();